package com.example.triangeorsquare;

public class Number {
    private int num;

    public Number(){
        num = 1;
    }

    public  Number(int num){
        this.num = num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum(){
        return num;
    }

    public boolean isTriangle(){
        if (num == 1) return true;
        int triangularNum =1;
        int x = 1;
        while (triangularNum < num){
            triangularNum += x+1;
            if(triangularNum == num) return true;
            x++;
        }
        return false;


    }
    public boolean isSquare(){
        int i = 0;
        int squareNumber =0;
        while(squareNumber < num){
            squareNumber = i * i;
            if (squareNumber == num) return true;
            i++;
        }
        return false;
    }
}
