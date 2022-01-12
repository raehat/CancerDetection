package com.example.haut;

import android.net.Uri;

import java.util.HashMap;

public class Utils {

    public static Uri imgVar;

    public static HashMap<Integer, String> hashMap = new HashMap<Integer, String>() {{
        put(0,"Actinic keratoses");
        put(1,"Basal cell carcinoma");
        put(2,"Benign keratosis-like lesions");
        put(3,"Dermatofibroma");
        put(4,"Melanocytic nevi");
        put(5,"Vascular lesions");
        put(6,"Melanoma");
    }};

    public static HashMap<Integer, String> hashMapInfo = new HashMap<Integer, String>() {{
        put(0,"Bowen's disease is a very early form of skin cancer that's easily treatable. The main sign is a red, scaly patch on the skin. It affects the squamous cells, which are in the outermost layer of skin, and is sometimes referred to as squamous cell carcinoma in situ.");
        put(1,"Basal cell carcinoma is a type of skin cancer that most often develops on areas of skin exposed to the sun, such as the face. On brown and Black skin, basal cell carcinoma often looks like a bump that's brown or glossy black and has a rolled border. Basal cell carcinoma is a type of skin cancer.");
        put(2,"Seborrheic keratoses are noncancerous (benign) skin growths that some people develop as they age. They often appear on the back or chest, but can occur on other parts of the body. Seborrheic keratoses grow slowly, in groups or singly. Most people will develop at least one seborrheic keratosis during their lifetime.");
        put(3,"Dermatofibroma (superficial benign fibrous histiocytoma) is a common cutaneous nodule of unknown etiology that occurs more often in women. Dermatofibroma frequently develops on the extremities (mostly the lower legs) and is usually asymptomatic, although pruritus and tenderness can be present.");
        put(4,"A melanocytic nevus (also known as nevocytic nevus, nevus-cell nevus and commonly as a mole) is a type of melanocytic tumor that contains nevus cells. Some sources equate the term mole with \"melanocytic nevus\", but there are also sources that equate the term mole with any nevus form");
        put(5,"Vascular lesions are relatively common abnormalities of the skin and underlying tissues, more commonly known as birthmarks. There are three major categories of vascular lesions: Hemangiomas, Vascular Malformations, and Pyogenic Granulomas.");
        put(6,"Melanoma occurs when the pigment-producing cells that give colour to the skin become cancerous.\n" +
                "Symptoms might include a new, unusual growth or a change in an existing mole. Melanomas can occur anywhere on the body");
    }};

}
