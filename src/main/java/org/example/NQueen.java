package org.example;

public class NQueen {
    public static void main(String[] args) {
        boolean a[][] = new boolean[8][8];
        String input[]={"(2,1)","(4,2)","(6,3)","(8,4)","(3,5)","(1,6)","(7,7)","(5,8)",};
        for (String data:input) {
            String[] split = data.replace("(", "").replace(")", "").split(",");
            a[Integer.parseInt(split[1])-1][Integer.parseInt(split[0])-1]=true;
        }
        boolean flag =true;
        for ( int i=0;i<8;i++){
            if(!flag){
                break;
            }
            for ( int j=0;j<8;j++){
                if(a[i][j]){
                    if(issave(a,i,j)==false){
                        flag=false;
                        break;
                    }
                }
            }
        }
        System.out.println("Save :-"+ flag);
    }
    private static boolean  issave(boolean a[][], int xPosistion, int yPosition){

        for ( int i=1;i<=8;i++){
            if(a[xPosistion][i-1]==true && yPosition!=i-1){
                return false;
            }
            if(a[i-1][yPosition]==true && xPosistion!=i-1){
                return false;
            }
            if((xPosistion-i)>=0 && (yPosition+i)<8 ){
                if(a[xPosistion-i][yPosition+i]==true){
                    return false;
                }}
            if((xPosistion-i)>=0 && (yPosition-i)>=0 ){
                if(a[xPosistion-i][yPosition-i]==true){
                    return false;
                }}
            if((xPosistion+i)<8 && (yPosition-i)>=0 ){
                if(a[xPosistion+i][yPosition-i]==true){
                    return false;
                }}
            if((xPosistion+i)<8 && (yPosition+i)<8 ){
                if(a[xPosistion+i][yPosition+i]==true ){
                    return false;
                }}
        }

        return true;
    }
}
