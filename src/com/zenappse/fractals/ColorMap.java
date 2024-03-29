package com.zenappse.fractals;

import java.util.Random;

/**
 * Created by Mark on 7/31/13.
 */
public class ColorMap {

    int[][] cmap_jet, cmap_hsv, cmap_hot, cmap_cool, cmap_spring, cmap_summer, cmap_autumn;
    int[][] cmap_winter, cmap_gray, cmap_bone, cmap_copper, cmap_pink, cmap_lines;
    int[][] cmap_jet_inv, cmap_hsv_inv, cmap_hot_inv, cmap_cool_inv ,cmap_spring_inv , cmap_summer_inv;
    int[][] cmap_autumn_inv, cmap_winter_inv, cmap_gray_inv, cmap_bone_inv, cmap_copper_inv, cmap_pink_inv;

    int [][] currentMap;

    int numberOfMaps = 25;
    int count = 1;

    public ColorMap() {
        cmap_jet = new int[][] {{0,0,143},{0,0,159},{0,0,175},{0,0,191},{0,0,207},{0,0,223},{0,0,239},
                {0,0,255},{0,16,255},{0,32,255},{0,48,255},{0,64,255},{0,80,255},{0,96,255},
                {0,112,255},{0,128,255},{0,143,255},{0,159,255},{0,175,255},{0,191,255},
                {0,207,255},{0,223,255},{0,239,255},{0,255,255},{16,255,239},{32,255,223},
                {48,255,207},{64,255,191},{80,255,175},{96,255,159},{112,255,143},{128,255,128},
                {143,255,112},{159,255,96},{175,255,80},{191,255,64},{207,255,48},{223,255,32},
                {239,255,16},{255,255,0},{255,239,0},{255,223,0},{255,207,0},{255,191,0},
                {255,175,0},{255,159,0},{255,143,0},{255,128,0},{255,112,0},{255,96,0},
                {255,80,0},{255,64,0},{255,48,0},{255,32,0},{255,16,0},{255,0,0},{239,0,0},
                {223,0,0},{207,0,0},{191,0,0},{175,0,0},{159,0,0},{143,0,0},{128,0,0}};

        cmap_jet_inv = new int[][] {{128,0,0},{143,0,0},{159,0,0},{175,0,0},{191,0,0},{207,0,0},
                {223,0,0},{239,0,0},{255,0,0},{255,16,0},{255,32,0},{255,48,0},{255,64,0},
                {255,80,0},{255,96,0},{255,112,0},{255,128,0},{255,143,0},{255,159,0},{255,175,0},
                {255,191,0},{255,207,0},{255,223,0},{255,239,0},{255,255,0},{239,255,16},
                {223,255,32},{207,255,48},{191,255,64},{175,255,80},{159,255,96},{143,255,112},
                {128,255,128},{112,255,143},{96,255,159},{80,255,175},{64,255,191},{48,255,207},
                {32,255,223},{16,255,239},{0,255,255},{0,239,255},{0,223,255},{0,207,255},
                {0,191,255},{0,175,255},{0,159,255},{0,143,255},{0,128,255},{0,112,255},{0,96,255},
                {0,80,255},{0,64,255},{0,48,255},{0,32,255},{0,16,255},{0,0,255},{0,0,239},
                {0,0,223},{0,0,207},{0,0,191},{0,0,175},{0,0,159},{0,0,143}};

        cmap_hsv = new int[][] {{255,0,0},{255,24,0},{255,48,0},{255,72,0},{255,96,0},{255,120,0},
                {255,143,0},{255,167,0},{255,191,0},{255,215,0},{255,239,0},{247,255,0},{223,255,0},
                {199,255,0},{175,255,0},{151,255,0},{128,255,0},{104,255,0},{80,255,0},{56,255,0},
                {32,255,0},{8,255,0},{0,255,16},{0,255,40},{0,255,64},{0,255,88},{0,255,112},
                {0,255,135},{0,255,159},{0,255,183},{0,255,207},{0,255,231},{0,255,255},{0,231,255},
                {0,207,255},{0,183,255},{0,159,255},{0,135,255},{0,112,255},{0,88,255},{0,64,255},
                {0,40,255},{0,16,255},{8,0,255},{32,0,255},{56,0,255},{80,0,255},{104,0,255},
                {128,0,255},{151,0,255},{175,0,255},{199,0,255},{223,0,255},{247,0,255},{255,0,239},
                {255,0,215},{255,0,191},{255,0,167},{255,0,143},{255,0,120},{255,0,96},{255,0,72},
                {255,0,48},{255,0,24}};

        cmap_hsv_inv = new int[][] {{255,0,24},{255,0,48},{255,0,72},{255,0,96},{255,0,120},
                {255,0,143},{255,0,167},{255,0,191},{255,0,215},{255,0,239},{247,0,255},{223,0,255},
                {199,0,255},{175,0,255},{151,0,255},{128,0,255},{104,0,255},{80,0,255},{56,0,255},
                {32,0,255},{8,0,255},{0,16,255},{0,40,255},{0,64,255},{0,88,255},{0,112,255},
                {0,135,255},{0,159,255},{0,183,255},{0,207,255},{0,231,255},{0,255,255},{0,255,231},
                {0,255,207},{0,255,183},{0,255,159},{0,255,135},{0,255,112},{0,255,88},{0,255,64},
                {0,255,40},{0,255,16},{8,255,0},{32,255,0},{56,255,0},{80,255,0},{104,255,0},
                {128,255,0},{151,255,0},{175,255,0},{199,255,0},{223,255,0},{247,255,0},{255,239,0},
                {255,215,0},{255,191,0},{255,167,0},{255,143,0},{255,120,0},{255,96,0},{255,72,0},
                {255,48,0},{255,24,0},{255,0,0}};

        cmap_hot = new int[][] {{11,0,0},{21,0,0},{32,0,0},{43,0,0},{53,0,0},{64,0,0},{74,0,0},{85,0,0},
                {96,0,0},{106,0,0},{117,0,0},{128,0,0},{138,0,0},{149,0,0},{159,0,0},
                {170,0,0},{181,0,0},{191,0,0},{202,0,0},{213,0,0},{223,0,0},{234,0,0},
                {244,0,0},{255,0,0},{255,11,0},{255,21,0},{255,32,0},{255,43,0},
                {255,53,0},{255,64,0},{255,74,0},{255,85,0},{255,96,0},{255,106,0},
                {255,117,0},{255,128,0},{255,138,0},{255,149,0},{255,159,0},{255,170,0},
                {255,181,0},{255,191,0},{255,202,0},{255,213,0},{255,223,0},{255,234,0},
                {255,244,0},{255,255,0},{255,255,16},{255,255,32},{255,255,48},
                {255,255,64},{255,255,80},{255,255,96},{255,255,112},{255,255,128},
                {255,255,143},{255,255,159},{255,255,175},{255,255,191},{255,255,207},
                {255,255,223},{255,255,239},{255,255,255}};

        cmap_hot_inv = new int[][] {{255,255,255},{255,255,239},{255,255,223},{255,255,207},
                {255,255,191},{255,255,175},{255,255,159},{255,255,143},{255,255,128},
                {255,255,112},{255,255,96},{255,255,80},{255,255,64},{255,255,48},{255,255,32},
                {255,255,16},{255,255,0},{255,244,0},{255,234,0},{255,223,0},{255,213,0},{255,202,0},
                {255,191,0},{255,181,0},{255,170,0},{255,159,0},{255,149,0},{255,138,0},{255,128,0},
                {255,117,0},{255,106,0},{255,96,0},{255,85,0},{255,74,0},{255,64,0},{255,53,0},
                {255,43,0},{255,32,0},{255,21,0},{255,11,0},{255,0,0},{244,0,0},{234,0,0},{223,0,0},
                {213,0,0},{202,0,0},{191,0,0},{181,0,0},{170,0,0},{159,0,0},{149,0,0},{138,0,0},
                {128,0,0},{117,0,0},{106,0,0},{96,0,0},{85,0,0},{74,0,0},{64,0,0},{53,0,0},{43,0,0},
                {32,0,0},{21,0,0},{11,0,0}};

        cmap_cool = new int[][] {{0,255,255},{4,251,255},{8,247,255},{12,243,255},{16,239,255},
                {20,235,255},{24,231,255},{28,227,255},{32,223,255},{36,219,255},{40,215,255},
                {45,210,255},{49,206,255},{53,202,255},{57,198,255},{61,194,255},{65,190,255},
                {69,186,255},{73,182,255},{77,178,255},{81,174,255},{85,170,255},{89,166,255},
                {93,162,255},{97,158,255},{101,154,255},{105,150,255},{109,146,255},{113,142,255},
                {117,138,255},{121,134,255},{125,130,255},{130,125,255},{134,121,255},{138,117,255},
                {142,113,255},{146,109,255},{150,105,255},{154,101,255},{158,97,255},{162,93,255},
                {166,89,255},{170,85,255},{174,81,255},{178,77,255},{182,73,255},{186,69,255},
                {190,65,255},{194,61,255},{198,57,255},{202,53,255},{206,49,255},{210,45,255},
                {215,40,255},{219,36,255},{223,32,255},{227,28,255},{231,24,255},{235,20,255},
                {239,16,255},{243,12,255},{247,8,255},{251,4,255},{255,0,255}};

        cmap_cool_inv = new int[][] {{255,0,255},{251,4,255},{247,8,255},{243,12,255},{239,16,255},
                {235,20,255},{231,24,255},{227,28,255},{223,32,255},{219,36,255},{215,40,255},
                {210,45,255},{206,49,255},{202,53,255},{198,57,255},{194,61,255},{190,65,255},
                {186,69,255},{182,73,255},{178,77,255},{174,81,255},{170,85,255},{166,89,255},
                {162,93,255},{158,97,255},{154,101,255},{150,105,255},{146,109,255},{142,113,255},
                {138,117,255},{134,121,255},{130,125,255},{125,130,255},{121,134,255},{117,138,255},
                {113,142,255},{109,146,255},{105,150,255},{101,154,255},{97,158,255},{93,162,255},
                {89,166,255},{85,170,255},{81,174,255},{77,178,255},{73,182,255},{69,186,255},
                {65,190,255},{61,194,255},{57,198,255},{53,202,255},{49,206,255},{45,210,255},
                {40,215,255},{36,219,255},{32,223,255},{28,227,255},{24,231,255},{20,235,255},
                {16,239,255},{12,243,255},{8,247,255},{4,251,255},{0,255,255}};

        cmap_spring = new int[][] {{255,0,255},{255,4,251},{255,8,247},{255,12,243},{255,16,239},
                {255,20,235},{255,24,231},{255,28,227},{255,32,223},{255,36,219},{255,40,215},
                {255,45,210},{255,49,206},{255,53,202},{255,57,198},{255,61,194},{255,65,190},
                {255,69,186},{255,73,182},{255,77,178},{255,81,174},{255,85,170},{255,89,166},
                {255,93,162},{255,97,158},{255,101,154},{255,105,150},{255,109,146},{255,113,142},
                {255,117,138},{255,121,134},{255,125,130},{255,130,125},{255,134,121},{255,138,117},
                {255,142,113},{255,146,109},{255,150,105},{255,154,101},{255,158,97},{255,162,93},
                {255,166,89},{255,170,85},{255,174,81},{255,178,77},{255,182,73},{255,186,69},
                {255,190,65},{255,194,61},{255,198,57},{255,202,53},{255,206,49},{255,210,45},
                {255,215,40},{255,219,36},{255,223,32},{255,227,28},{255,231,24},{255,235,20},
                {255,239,16},{255,243,12},{255,247,8},{255,251,4},{255,255,0}};

        cmap_spring_inv = new int[][] {{255,255,0},{255,251,4},{255,247,8},{255,243,12},
                {255,239,16},{255,235,20},{255,231,24},{255,227,28},{255,223,32},{255,219,36},
                {255,215,40},{255,210,45},{255,206,49},{255,202,53},{255,198,57},{255,194,61},
                {255,190,65},{255,186,69},{255,182,73},{255,178,77},{255,174,81},{255,170,85},
                {255,166,89},{255,162,93},{255,158,97},{255,154,101},{255,150,105},{255,146,109},
                {255,142,113},{255,138,117},{255,134,121},{255,130,125},{255,125,130},{255,121,134},
                {255,117,138},{255,113,142},{255,109,146},{255,105,150},{255,101,154},{255,97,158},
                {255,93,162},{255,89,166},{255,85,170},{255,81,174},{255,77,178},{255,73,182},
                {255,69,186},{255,65,190},{255,61,194},{255,57,198},{255,53,202},{255,49,206},
                {255,45,210},{255,40,215},{255,36,219},{255,32,223},{255,28,227},{255,24,231},
                {255,20,235},{255,16,239},{255,12,243},{255,8,247},{255,4,251},{255,0,255}};

        cmap_summer = new int[][] {{0,128,102},{4,130,102},{8,132,102},{12,134,102},{16,136,102},
                {20,138,102},{24,140,102},{28,142,102},{32,144,102},{36,146,102},{40,148,102},
                {45,150,102},{49,152,102},{53,154,102},{57,156,102},{61,158,102},{65,160,102},
                {69,162,102},{73,164,102},{77,166,102},{81,168,102},{85,170,102},{89,172,102},
                {93,174,102},{97,176,102},{101,178,102},{105,180,102},{109,182,102},{113,184,102},
                {117,186,102},{121,188,102},{125,190,102},{130,192,102},{134,194,102},{138,196,102},
                {142,198,102},{146,200,102},{150,202,102},{154,204,102},{158,206,102},{162,208,102},
                {166,210,102},{170,212,102},{174,215,102},{178,217,102},{182,219,102},{186,221,102},
                {190,223,102},{194,225,102},{198,227,102},{202,229,102},{206,231,102},{210,233,102},
                {215,235,102},{219,237,102},{223,239,102},{227,241,102},{231,243,102},{235,245,102},
                {239,247,102},{243,249,102},{247,251,102},{251,253,102},{255,255,102}};

        cmap_summer_inv = new int[][] {{255,255,102},{251,253,102},{247,251,102},{243,249,102},
                {239,247,102},{235,245,102},{231,243,102},{227,241,102},{223,239,102},{219,237,102},
                {215,235,102},{210,233,102},{206,231,102},{202,229,102},{198,227,102},{194,225,102},
                {190,223,102},{186,221,102},{182,219,102},{178,217,102},{174,215,102},{170,212,102},
                {166,210,102},{162,208,102},{158,206,102},{154,204,102},{150,202,102},{146,200,102},
                {142,198,102},{138,196,102},{134,194,102},{130,192,102},{125,190,102},{121,188,102},
                {117,186,102},{113,184,102},{109,182,102},{105,180,102},{101,178,102},{97,176,102},
                {93,174,102},{89,172,102},{85,170,102},{81,168,102},{77,166,102},{73,164,102},
                {69,162,102},{65,160,102},{61,158,102},{57,156,102},{53,154,102},{49,152,102},
                {45,150,102},{40,148,102},{36,146,102},{32,144,102},{28,142,102},{24,140,102},
                {20,138,102},{16,136,102},{12,134,102},{8,132,102},{4,130,102},{0,128,102}};

        cmap_autumn = new int[][] {{255,0,0},{255,4,0},{255,8,0},{255,12,0},{255,16,0},{255,20,0},
                {255,24,0},{255,28,0},{255,32,0},{255,36,0},{255,40,0},{255,45,0},{255,49,0},
                {255,53,0},{255,57,0},{255,61,0},{255,65,0},{255,69,0},{255,73,0},{255,77,0},
                {255,81,0},{255,85,0},{255,89,0},{255,93,0},{255,97,0},{255,101,0},{255,105,0},
                {255,109,0},{255,113,0},{255,117,0},{255,121,0},{255,125,0},{255,130,0},{255,134,0},
                {255,138,0},{255,142,0},{255,146,0},{255,150,0},{255,154,0},{255,158,0},{255,162,0},
                {255,166,0},{255,170,0},{255,174,0},{255,178,0},{255,182,0},{255,186,0},{255,190,0},
                {255,194,0},{255,198,0},{255,202,0},{255,206,0},{255,210,0},{255,215,0},{255,219,0},
                {255,223,0},{255,227,0},{255,231,0},{255,235,0},{255,239,0},{255,243,0},{255,247,0},
                {255,251,0},{255,255,0}};

        cmap_autumn_inv = new int[][] {{255,255,0},{255,251,0},{255,247,0},{255,243,0},{255,239,0},
                {255,235,0},{255,231,0},{255,227,0},{255,223,0},{255,219,0},{255,215,0},{255,210,0},
                {255,206,0},{255,202,0},{255,198,0},{255,194,0},{255,190,0},{255,186,0},{255,182,0},
                {255,178,0},{255,174,0},{255,170,0},{255,166,0},{255,162,0},{255,158,0},{255,154,0},
                {255,150,0},{255,146,0},{255,142,0},{255,138,0},{255,134,0},{255,130,0},{255,125,0},
                {255,121,0},{255,117,0},{255,113,0},{255,109,0},{255,105,0},{255,101,0},{255,97,0},
                {255,93,0},{255,89,0},{255,85,0},{255,81,0},{255,77,0},{255,73,0},{255,69,0},
                {255,65,0},{255,61,0},{255,57,0},{255,53,0},{255,49,0},{255,45,0},{255,40,0},
                {255,36,0},{255,32,0},{255,28,0},{255,24,0},{255,20,0},{255,16,0},{255,12,0},
                {255,8,0},{255,4,0},{255,0,0}};

        cmap_winter = new int[][] {{0,0,255},{0,4,253},{0,8,251},{0,12,249},{0,16,247},{0,20,245},
                {0,24,243},{0,28,241},{0,32,239},{0,36,237},{0,40,235},{0,45,233},{0,49,231},
                {0,53,229},{0,57,227},{0,61,225},{0,65,223},{0,69,221},{0,73,219},{0,77,217},
                {0,81,215},{0,85,213},{0,89,210},{0,93,208},{0,97,206},{0,101,204},{0,105,202},
                {0,109,200},{0,113,198},{0,117,196},{0,121,194},{0,125,192},{0,130,190},{0,134,188},
                {0,138,186},{0,142,184},{0,146,182},{0,150,180},{0,154,178},{0,158,176},{0,162,174},
                {0,166,172},{0,170,170},{0,174,168},{0,178,166},{0,182,164},{0,186,162},{0,190,160},
                {0,194,158},{0,198,156},{0,202,154},{0,206,152},{0,210,150},{0,215,148},{0,219,146},
                {0,223,144},{0,227,142},{0,231,140},{0,235,138},{0,239,136},{0,243,134},{0,247,132},
                {0,251,130},{0,255,128}};

        cmap_winter_inv = new int[][] {{0,255,128},{0,251,130},{0,247,132},{0,243,134},{0,239,136},
                {0,235,138},{0,231,140},{0,227,142},{0,223,144},{0,219,146},{0,215,148},{0,210,150},
                {0,206,152},{0,202,154},{0,198,156},{0,194,158},{0,190,160},{0,186,162},{0,182,164},
                {0,178,166},{0,174,168},{0,170,170},{0,166,172},{0,162,174},{0,158,176},{0,154,178},
                {0,150,180},{0,146,182},{0,142,184},{0,138,186},{0,134,188},{0,130,190},{0,125,192},
                {0,121,194},{0,117,196},{0,113,198},{0,109,200},{0,105,202},{0,101,204},{0,97,206},
                {0,93,208},{0,89,210},{0,85,213},{0,81,215},{0,77,217},{0,73,219},{0,69,221},
                {0,65,223},{0,61,225},{0,57,227},{0,53,229},{0,49,231},{0,45,233},{0,40,235},
                {0,36,237},{0,32,239},{0,28,241},{0,24,243},{0,20,245},{0,16,247},{0,12,249},
                {0,8,251},{0,4,253},{0,0,255}};

        cmap_gray = new int[][] {{0,0,0},{4,4,4},{8,8,8},{12,12,12},{16,16,16},{20,20,20},
                {24,24,24},{28,28,28},{32,32,32},{36,36,36},{40,40,40},{45,45,45},{49,49,49},
                {53,53,53},{57,57,57},{61,61,61},{65,65,65},{69,69,69},{73,73,73},{77,77,77},
                {81,81,81},{85,85,85},{89,89,89},{93,93,93},{97,97,97},{101,101,101},{105,105,105},
                {109,109,109},{113,113,113},{117,117,117},{121,121,121},{125,125,125},{130,130,130},
                {134,134,134},{138,138,138},{142,142,142},{146,146,146},{150,150,150},{154,154,154},
                {158,158,158},{162,162,162},{166,166,166},{170,170,170},{174,174,174},{178,178,178},
                {182,182,182},{186,186,186},{190,190,190},{194,194,194},{198,198,198},{202,202,202},
                {206,206,206},{210,210,210},{215,215,215},{219,219,219},{223,223,223},{227,227,227},
                {231,231,231},{235,235,235},{239,239,239},{243,243,243},{247,247,247},{251,251,251},
                {255,255,255}};

        cmap_gray_inv = new int[][] {{255,255,255},{251,251,251},{247,247,247},{243,243,243},
                {239,239,239},{235,235,235},{231,231,231},{227,227,227},{223,223,223},{219,219,219},
                {215,215,215},{210,210,210},{206,206,206},{202,202,202},{198,198,198},{194,194,194},
                {190,190,190},{186,186,186},{182,182,182},{178,178,178},{174,174,174},{170,170,170},
                {166,166,166},{162,162,162},{158,158,158},{154,154,154},{150,150,150},{146,146,146},
                {142,142,142},{138,138,138},{134,134,134},{130,130,130},{125,125,125},{121,121,121},
                {117,117,117},{113,113,113},{109,109,109},{105,105,105},{101,101,101},{97,97,97},
                {93,93,93},{89,89,89},{85,85,85},{81,81,81},{77,77,77},{73,73,73},{69,69,69},
                {65,65,65},{61,61,61},{57,57,57},{53,53,53},{49,49,49},{45,45,45},{40,40,40},
                {36,36,36},{32,32,32},{28,28,28},{24,24,24},{20,20,20},{16,16,16},{12,12,12},
                {8,8,8},{4,4,4},{0,0,0}};

        cmap_bone = new int[][] {{0,0,1},{4,4,6},{7,7,11},{11,11,16},{14,14,21},{18,18,26},{21,21,31},
                {25,25,35},{28,28,40},{32,32,45},{35,35,50},{39,39,55},{43,43,60},
                {46,46,65},{50,50,70},{53,53,74},{57,57,79},{60,60,84},{64,64,89},
                {67,67,94},{71,71,99},{74,74,104},{78,78,108},{81,81,113},{85,86,117},
                {89,91,120},{92,96,124},{96,101,128},{99,106,131},{103,111,135},
                {106,116,138},{110,120,142},{113,125,145},{117,130,149},{120,135,152},
                {124,140,156},{128,145,159},{131,150,163},{135,155,166},{138,159,170},
                {142,164,174},{145,169,177},{149,174,181},{152,179,184},{156,184,188},
                {159,189,191},{163,193,195},{166,198,198},{172,202,202},{178,205,205},
                {183,209,209},{189,213,213},{194,216,216},{200,220,220},{205,223,223},
                {211,227,227},{216,230,230},{222,234,234},{227,237,237},{233,241,241},
                {238,244,244},{244,248,248},{249,251,251},{255,255,255}};

        cmap_bone_inv = new int[][] {{255,255,255},{249,251,251},{244,248,248},{238,244,244},
                {233,241,241},{227,237,237},{222,234,234},{216,230,230},{211,227,227},{205,223,223},
                {200,220,220},{194,216,216},{189,213,213},{183,209,209},{178,205,205},{172,202,202},
                {166,198,198},{163,193,195},{159,189,191},{156,184,188},{152,179,184},{149,174,181},
                {145,169,177},{142,164,174},{138,159,170},{135,155,166},{131,150,163},{128,145,159},
                {124,140,156},{120,135,152},{117,130,149},{113,125,145},{110,120,142},{106,116,138},
                {103,111,135},{99,106,131},{96,101,128},{92,96,124},{89,91,120},{85,86,117},
                {81,81,113},{78,78,108},{74,74,104},{71,71,99},{67,67,94},{64,64,89},{60,60,84},
                {57,57,79},{53,53,74},{50,50,70},{46,46,65},{43,43,60},{39,39,55},{35,35,50},
                {32,32,45},{28,28,40},{25,25,35},{21,21,31},{18,18,26},{14,14,21},{11,11,16},
                {7,7,11},{4,4,6},{0,0,1}};

        cmap_copper = new int[][] {{0,0,0},{5,3,2},{10,6,4},{15,9,6},{20,13,8},{25,16,10},
                {30,19,12},{35,22,14},{40,25,16},{46,28,18},{51,32,20},{56,35,22},{61,38,24},
                {66,41,26},{71,44,28},{76,47,30},{81,51,32},{86,54,34},{91,57,36},{96,60,38},
                {101,63,40},{106,66,42},{111,70,44},{116,73,46},{121,76,48},{126,79,50},{132,82,52},
                {137,85,54},{142,89,56},{147,92,58},{152,95,60},{157,98,62},{162,101,64},
                {167,104,66},{172,108,68},{177,111,70},{182,114,72},{187,117,75},{192,120,77},
                {197,123,79},{202,126,81},{207,130,83},{212,133,85},{218,136,87},{223,139,89},
                {228,142,91},{233,145,93},{238,149,95},{243,152,97},{248,155,99},{253,158,101},
                {255,161,103},{255,164,105},{255,168,107},{255,171,109},{255,174,111},{255,177,113},
                {255,180,115},{255,183,117},{255,187,119},{255,190,121},{255,193,123},
                {255,196,125},{255,199,127}};

        cmap_copper_inv = new int[][] {{255,199,127},{255,196,125},{255,193,123},{255,190,121},
                {255,187,119},{255,183,117},{255,180,115},{255,177,113},{255,174,111},{255,171,109},
                {255,168,107},{255,164,105},{255,161,103},{253,158,101},{248,155,99},{243,152,97},
                {238,149,95},{233,145,93},{228,142,91},{223,139,89},{218,136,87},{212,133,85},
                {207,130,83},{202,126,81},{197,123,79},{192,120,77},{187,117,75},{182,114,72},
                {177,111,70},{172,108,68},{167,104,66},{162,101,64},{157,98,62},{152,95,60},
                {147,92,58},{142,89,56},{137,85,54},{132,82,52},{126,79,50},{121,76,48},{116,73,46},
                {111,70,44},{106,66,42},{101,63,40},{96,60,38},{91,57,36},{86,54,34},{81,51,32},
                {76,47,30},{71,44,28},{66,41,26},{61,38,24},{56,35,22},{51,32,20},{46,28,18},
                {40,25,16},{35,22,14},{30,19,12},{25,16,10},{20,13,8},{15,9,6},{10,6,4},{5,3,2},{0,0,0}};

        cmap_pink = new int[][] {{30,0,0},{50,26,26},{64,37,37},{75,45,45},{85,52,52},{94,59,59},
                {102,64,64},{110,69,69},{117,74,74},{123,79,79},{130,83,83},{136,87,87},{141,91,91},
                {147,95,95},{152,98,98},{157,102,102},{162,105,105},{167,108,108},{172,111,111},
                {176,114,114},{181,117,117},{185,120,120},{189,123,123},{194,126,126},{195,132,129},
                {197,138,131},{199,144,134},{201,149,136},{202,154,139},{204,159,141},{206,164,144},
                {207,169,146},{209,174,148},{211,178,151},{212,183,153},{214,187,155},{216,191,157},
                {217,195,160},{219,199,162},{220,203,164},{222,207,166},{223,211,168},{225,215,170},
                {226,218,172},{228,222,174},{229,225,176},{231,229,178},{232,232,180},{234,234,185},
                {235,235,191},{237,237,196},{238,238,201},{240,240,206},{241,241,211},{243,243,216},
                {244,244,221},{245,245,225},{247,247,230},{248,248,234},{250,250,238},{251,251,243},
                {252,252,247},{254,254,251},{255,255,255}};

        cmap_pink_inv = new int[][] {{255,255,255},{254,254,251},{252,252,247},{251,251,243},
                {250,250,238},{248,248,234},{247,247,230},{245,245,225},{244,244,221},{243,243,216},
                {241,241,211},{240,240,206},{238,238,201},{237,237,196},{235,235,191},{234,234,185},
                {232,232,180},{231,229,178},{229,225,176},{228,222,174},{226,218,172},{225,215,170},
                {223,211,168},{222,207,166},{220,203,164},{219,199,162},{217,195,160},{216,191,157},
                {214,187,155},{212,183,153},{211,178,151},{209,174,148},{207,169,146},{206,164,144},
                {204,159,141},{202,154,139},{201,149,136},{199,144,134},{197,138,131},{195,132,129},
                {194,126,126},{189,123,123},{185,120,120},{181,117,117},{176,114,114},{172,111,111},
                {167,108,108},{162,105,105},{157,102,102},{152,98,98},{147,95,95},{141,91,91},
                {136,87,87},{130,83,83},{123,79,79},{117,74,74},{110,69,69},{102,64,64},{94,59,59},
                {85,52,52},{75,45,45},{64,37,37},{50,26,26},{30,0,0}};

        cmap_lines = new int[][] {{0,0,255},{64,64,64},{191,191,0},{191,0,191},{0,191,191},
                {255,0,0},{0,128,0},{0,0,255},{64,64,64},{191,191,0},{191,0,191},{0,191,191},
                {255,0,0},{0,128,0},{0,0,255},{64,64,64},{191,191,0},{191,0,191},{0,191,191},
                {255,0,0},{0,128,0},{0,0,255},{64,64,64},{191,191,0},{191,0,191},{0,191,191},
                {255,0,0},{0,128,0},{0,0,255},{64,64,64},{191,191,0},{191,0,191},{0,191,191},
                {255,0,0},{0,128,0},{0,0,255},{64,64,64},{191,191,0},{191,0,191},{0,191,191},
                {255,0,0},{0,128,0},{0,0,255},{64,64,64},{191,191,0},{191,0,191},{0,191,191},
                {255,0,0},{0,128,0},{0,0,255},{64,64,64},{191,191,0},{191,0,191},{0,191,191},
                {255,0,0},{0,128,0},{0,0,255},{64,64,64},{191,191,0},{191,0,191},{0,191,191},
                {255,0,0},{0,128,0},{0,0,255}};

        setColorMap(6);
    }

    public int getColor(int val, int index){
        return currentMap[val][index];
    }

    public void setNextColorMap(){
        count = count + 1;
        int choice = count % numberOfMaps;

        if(choice==0){ currentMap = cmap_lines; }
        else if(choice==1) { currentMap = cmap_pink_inv; }
        else if(choice==2) { currentMap = cmap_pink; }
        else if(choice==3) { currentMap = cmap_copper_inv; }
        else if(choice==4) { currentMap = cmap_copper; }
        else if(choice==5) { currentMap = cmap_bone_inv; }
        else if(choice==6) { currentMap = cmap_bone; }
        else if(choice==7) { currentMap = cmap_gray_inv; }
        else if(choice==8) { currentMap = cmap_gray; }
        else if(choice==9) { currentMap = cmap_winter_inv; }
        else if(choice==10) { currentMap = cmap_winter; }
        else if(choice==11) { currentMap = cmap_autumn_inv; }
        else if(choice==12) { currentMap = cmap_autumn; }
        else if(choice==13) { currentMap = cmap_summer_inv; }
        else if(choice==14) { currentMap = cmap_summer; }
        else if(choice==15) { currentMap = cmap_spring_inv; }
        else if(choice==16) { currentMap = cmap_spring; }
        else if(choice==17) { currentMap = cmap_cool_inv; }
        else if(choice==18) { currentMap = cmap_cool; }
        else if(choice==19) { currentMap = cmap_hot_inv; }
        else if(choice==20) { currentMap = cmap_hot; }
        else if(choice==21) { currentMap = cmap_hsv_inv; }
        else if(choice==22) { currentMap = cmap_hsv; }
        else if(choice==23) { currentMap = cmap_jet_inv; }
        else if(choice==24) { currentMap = cmap_jet; }
    }

    public void setColorMap(int choice){
        if(choice==0){ currentMap = cmap_lines; }
        else if(choice==1) { currentMap = cmap_pink_inv; }
        else if(choice==2) { currentMap = cmap_pink; }
        else if(choice==3) { currentMap = cmap_copper_inv; }
        else if(choice==4) { currentMap = cmap_copper; }
        else if(choice==5) { currentMap = cmap_bone_inv; }
        else if(choice==6) { currentMap = cmap_bone; }
        else if(choice==7) { currentMap = cmap_gray_inv; }
        else if(choice==8) { currentMap = cmap_gray; }
        else if(choice==9) { currentMap = cmap_winter_inv; }
        else if(choice==10) { currentMap = cmap_winter; }
        else if(choice==11) { currentMap = cmap_autumn_inv; }
        else if(choice==12) { currentMap = cmap_autumn; }
        else if(choice==13) { currentMap = cmap_summer_inv; }
        else if(choice==14) { currentMap = cmap_summer; }
        else if(choice==15) { currentMap = cmap_spring_inv; }
        else if(choice==16) { currentMap = cmap_spring; }
        else if(choice==17) { currentMap = cmap_cool_inv; }
        else if(choice==18) { currentMap = cmap_cool; }
        else if(choice==19) { currentMap = cmap_hot_inv; }
        else if(choice==20) { currentMap = cmap_hot; }
        else if(choice==21) { currentMap = cmap_hsv_inv; }
        else if(choice==22) { currentMap = cmap_hsv; }
        else if(choice==23) { currentMap = cmap_jet_inv; }
        else if(choice==24) { currentMap = cmap_jet; }
    }

    public void setRandomColorMap(){
        Random rand = new Random();
        int choice = rand.nextInt(25);

        if(choice==0){ currentMap = cmap_lines; }
        else if(choice==1) { currentMap = cmap_pink_inv; }
        else if(choice==2) { currentMap = cmap_pink; }
        else if(choice==3) { currentMap = cmap_copper_inv; }
        else if(choice==4) { currentMap = cmap_copper; }
        else if(choice==5) { currentMap = cmap_bone_inv; }
        else if(choice==6) { currentMap = cmap_bone; }
        else if(choice==7) { currentMap = cmap_gray_inv; }
        else if(choice==8) { currentMap = cmap_gray; }
        else if(choice==9) { currentMap = cmap_winter_inv; }
        else if(choice==10) { currentMap = cmap_winter; }
        else if(choice==11) { currentMap = cmap_autumn_inv; }
        else if(choice==12) { currentMap = cmap_autumn; }
        else if(choice==13) { currentMap = cmap_summer_inv; }
        else if(choice==14) { currentMap = cmap_summer; }
        else if(choice==15) { currentMap = cmap_spring_inv; }
        else if(choice==16) { currentMap = cmap_spring; }
        else if(choice==17) { currentMap = cmap_cool_inv; }
        else if(choice==18) { currentMap = cmap_cool; }
        else if(choice==19) { currentMap = cmap_hot_inv; }
        else if(choice==20) { currentMap = cmap_hot; }
        else if(choice==21) { currentMap = cmap_hsv_inv; }
        else if(choice==22) { currentMap = cmap_hsv; }
        else if(choice==23) { currentMap = cmap_jet_inv; }
        else if(choice==24) { currentMap = cmap_jet; }
    }
}
