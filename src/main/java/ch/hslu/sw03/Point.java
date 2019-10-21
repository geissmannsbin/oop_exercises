package ch.hslu.sw03;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class Point {
    private int x;
    private int y;


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int max2(int a, int b) {
        int result = 0;
        if (a <= b) {
            result = b;
        } else {
            result = a;
        }

        return result;
    }

    public int getQuadrant() {
        int result = 0;
        if (this.x == 0 && this.y == 0) {
            result = 0;
        } else if (this.x >= 0 && this.y >= 0) {
            result = 1;
        } else if (this.x <= 0 && this.y >= 0) {
            result = 2;
        } else if (this.x <= 0 && this.y <= 0) {
            result = 3;
        } else if (this.x >= 0 && this.y <= 0) {
            result = 4;
        }

        return result;
    }

    public int min2(int a, int b) {
        int result = 0;
        if (a <= b) {
            result = a;
        } else if (a >= b) {
            result = b;
        }

        return result;
    }

    public int max3(int a, int b, int c) {
        int result = 0;
        if (a >= b && a >= c) {
            result = a;
        } else if (b >= a && b >= c) {
            result = b;
        } else if (c >= a && c >= b) {
            result = c;
        }

        return result;
    }

    public String aggregatsZustand(String element, double temperatur) {
        String result;
        label43: {
            label42: {
                result = "";
                switch(element.hashCode()) {
                    case 78:
                        if (!element.equals("N")) {
                            break label43;
                        }

                        if (temperatur < -210.0D) {
                            result = "fest";
                        } else if (temperatur < -195.8D) {
                            result = "flüssig";
                        } else {
                            result = "gasförmig";
                        }
                        break;
                    case 2335:
                        if (!element.equals("Hg")) {
                            break label43;
                        }
                        break;
                    case 2578:
                        if (!element.equals("Pb")) {
                            break label43;
                        }
                        break label42;
                    default:
                        break label43;
                }

                if (temperatur < -38.83D) {
                    result = "fest";
                } else if (temperatur < 356.7D) {
                    result = "flüssig";
                } else {
                    result = "gasförmig";
                }
            }

            if (temperatur < 327.5D) {
                result = "fest";
            } else if (temperatur < 1749.0D) {
                result = "flüssig";
            } else {
                result = "gasförmig";
            }
        }

        result = "error";
        return result;
    }
}
