package com.example.haut.ui.Fragment1;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.haut.R;
import com.example.haut.ResultActivity;
import com.example.haut.Utils;
import com.example.haut.ml.Model;
import com.example.haut.ml.Shades;

import org.tensorflow.lite.DataType;
import org.tensorflow.lite.support.image.TensorImage;
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer;

import java.io.IOException;
import java.nio.ByteBuffer;

public class Fragment1 extends Fragment {

    @Nullable

    ImageView imageView;
    Button buttonPredict;
    TextView textViewResult;
    private Bitmap img;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_1, container, false);

        imageView = view.findViewById(R.id.imageView);
        buttonPredict = view.findViewById(R.id.button_predict);
        textViewResult = view.findViewById(R.id.text_view_result);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("image/*");
                startActivityForResult(intent, 100);

            }
        });

        buttonPredict.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img = Bitmap.createScaledBitmap(img, 28, 28, true);

                try {
                    Model model = Model.newInstance(getContext());

                    // Creates inputs for reference.
                    TensorBuffer inputFeature0 = TensorBuffer.createFixedSize(new int[]{1, 28, 28, 3}, DataType.FLOAT32);

                    TensorImage tensorImage = new TensorImage(DataType.FLOAT32);
                    tensorImage.load(img);
                    ByteBuffer byteBuffer = tensorImage.getBuffer();

                    // Toast.makeText(getApplicationContext(), "" + byteBuffer.toString() + " = " + inputFeature0.getBuffer().toString(), Toast.LENGTH_SHORT).show();

                    inputFeature0.loadBuffer(byteBuffer);

                    // Runs model inference and gets result.
                    Model.Outputs outputs = model.process(inputFeature0);
                    TensorBuffer outputFeature0 = outputs.getOutputFeature0AsTensorBuffer();

                    // Releases model resources if no longer used.
                    model.close();

                    float[] arr = outputFeature0.getFloatArray();


                    Intent intent = new Intent(getContext(), ResultActivity.class);
                    intent.putExtra("arr", arr);
                    startActivity(intent);


                } catch (IOException e) {
                    // TODO Handle the exception
                }
            }
        });

        return view;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 100) {

            imageView.setImageURI(data.getData());
            Utils.imgVar = data.getData();

            Uri uri = data.getData();
            try {
                img = MediaStore.Images.Media.getBitmap(getContext().getContentResolver(), uri);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

}