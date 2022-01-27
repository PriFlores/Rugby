package app.enums;

public enum PlayersPositions { // enums values for specific items that will never change 
    LOOSEHEAD_PROP(0), TIGHTHEAD_PROP(1),
    HOOKER(2), SECOND_ROW(3), BLIND_SIDE_FLANKER(4), OPEN_SIDE_FLANKER(5), NUMBER_8(6), SERUM_HALF(7), FLY_HALF(8),
    RIGHT_SID_WING(9), LEFT_SIDE_WING(10), INSIDE_CENTER(11), OUTSIDE_CENTER(12), FULL_BACK(13);

    public int valueType; // controls variable to allow class to assign player positions 

    PlayersPositions(int value) {
        valueType = value;
    }
}
