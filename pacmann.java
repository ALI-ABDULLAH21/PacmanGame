import java.util.*;

class Maze  {
    int move;

    int l = 20;
    int n = 27;
    char[][] bound = new char[l][n];

    public void loadmaze() {


        for (int i = 0; i < l; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == l - 1 || j == 0 || j == n - 1) {
                    bound[i][j] = '*';

                } else if (i == 2 && j > 3 && j < 13) {
                    bound[i][j] = '#';

                } else if (j == 3 && i > 5 && i < 14) {
                    bound[i][j] = '#';

                } else if (i == 13 && j > 7 && j < 17) {
                    bound[i][j] = '#';

                } else if (j == 22 && i > 5 && i < 14) {
                    bound[i][j] = '#';

                } else if (i == 18 && j > 3 && j < 13) {
                    bound[i][j] = '#';

                } else if (j == 20 && i > 2 && i < 11) {
                    bound[i][j] = '#';

                } else if (i == 9 && j == 11) {
                    bound[i][j] = '#';

                } else if (j == 10 && i > 2 && i < 8) {
                    bound[i][j] = '#';
                } else if (i == 16 && j == 22) {
                    bound[i][j] = '#';


                } else {
                    bound[i][j] = '.';

                }

            }



        }
    }
        public void plays (int pacmx,int pacmy,int dir,int e1x,int e1y,int e1d,int e2x,int e2y,int e2d)
        {
            bound[e2x][e2y] = 'E';
            bound[pacmx][pacmy] = 'P';
            bound[e1x][e1y] = 'E';


            if(e2d==1||e1d==1){


                bound[e2x-1][e2y] = '.';
                bound[e1x-1][e1y] = '.';


            }
            if(e2d==2||e1d==2){


                bound[e2x+1][e2y] = '.';
                bound[e1x+1][e1y] = '.';


            }
            if(e2d==3||e1d==3){


                bound[e2x][e2y-1] = '.';
                bound[e1x][e1y-1] = '.';



            }
            if(e2d==4||e1d==4){


                bound[e2x][e2y+1] = '.';
                bound[e1x][e1y+1] = '.';



            }


            if (dir == 1) {

                bound[pacmx - 1][pacmy] = ' ';




            }
            if (dir == 2) {

                bound[pacmx + 1][pacmy] = ' ';



            }
            if (dir == 3) {

                bound[pacmx][pacmy - 1] = ' ';





            }
            if (dir == 4) {

                bound[pacmx][pacmy + 1] = ' ';



            }







        }

        public void print(char array[][]){

            for (int i = 0; i < l; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(array[i][j] + " ");

                }
                System.out.println(" ");
            }


        }


    }







class gameplay {
    int pacx, pacy;

    int ene1x, ene1y;
    int ene2x, ene2y;
    int pax, pay;


    public boolean play(int pacx, int pacy, int ene1x, int ene1y, int ene2x, int ene2y) {
        this.pacx = pacx;


        this.pacy = pacy;

        this.ene1x = ene1x;
        this.ene1y = ene1y;
        this.ene2x = ene2x;
        this.ene2y = ene2y;


        if (pacx == ene1x && pacy == ene1y) {
            System.out.println("    PACKMAN AND ENEMY1 ARE AT SAME POSITION /    ");
            return true;
        } else if (pacx == ene2x && pacy == ene2y) {
            System.out.println("    PACMAN AND ENEMY2 ARE AT SAME POSITION  /        ");
            return true;

        }


        return false;

    }
}
//int[][] hurdles ={{2,4},{2,5},{2,6},{2,7},{2,8},{2,9},{2,10},{2,11},{2,12},{6,3},{7,3},{8,3},{9,3},{10,3},{11,3},{12,3},{13,3},{3,10},{4,10},{5,10},{6,10},{7,10},{3,20},{4,20},{5,20},{6,20},{7,20},{8,20},{9,20},{10,20},{6,22},{7,22},{8,22},{9,22},{10,22},{11,22},{12,22},{13,22},{13,8},{13,9},{13,10},{13,11},{13,12},{13,13},{13,14},{13,15},{13,16},{9,11},{16,22},{18,4},{18,5},{18,6},{18,7},{18,8},{18,9},{18,10},{18,11},{18,12}};





class  Packman{

    public   int x=10;
    public  int y=7;
    int move;


    public int[] Pmove() {
        int hurdles [][]={{2,4},{2,5},{2,6},{2,7},{2,8},{2,9},{2,10},{2,11},{2,12},{6,3},{7,3},{8,3},{9,3},{10,3},{11,3},{12,3},{13,3},{3,10},{4,10},{5,10},{6,10},{7,10},{3,20},{4,20},{5,20},{6,20},{7,20},{8,20},{9,20},{10,20},{6,22},{7,22},{8,22},{9,22},{10,22},{11,22},{12,22},{13,22},{13,8},{13,9},{13,10},{13,11},{13,12},{13,13},{13,14},{13,15},{13,16},{9,11},{16,22},{18,4},{18,5},{18,6},{18,7},{18,8},{18,9},{18,10},{18,11},{18,12}};









        System.out.println("Choose the position of pacman:");
        System.out.println("1-For right\n2-For left\n3-For straight\n4-For backward");


        System.out.println("Enter the position of packman here:");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();



        switch (input) {
            case 1:
                x += 1;

                for (int j = 0; j <= 48; j++) {
                    if (x == hurdles[j][0] && y == hurdles[j][1]) {
                        System.out.println("   ~~  ~~          PACKMAN faced a hurdle at " + hurdles[j][0] + "," + hurdles[j][1]);

                        x -= 1;
                        move=1;

                    }
                }
                move=1;

                break;
            case 2:
                x-= 1;
                for (int q= 0; q<= 48; q++) {
                    if (x == hurdles[q][0] && y == hurdles[q][1]) {
                        System.out.println("   ~~   ~~       PACKMAN faced a hurdle at " + hurdles[q][0] + "," + hurdles[q][1]);
                        x+= 1;
                        move=2;

                    }
                }
                move=2;

                break;
            case 3:
                y += 1;
                for (int q = 0; q<=48; q++) {
                    if (x == hurdles[q][0] && y == hurdles[q][1]) {
                        System.out.println("  ~~    ~~        PACKMAN faced a hurdle at " + hurdles[q][0] + "," + hurdles[q][1]);

                        y -= 1;
                        move=3;


                    }
                }
                move=3;

                break;
            case 4:
                y -= 1;
                for (int q = 0; q <= 48; q++) {
                    if (x == hurdles[q][0] && y == hurdles[q][1]) {
                        System.out.println("  ~~   ~~            PACKMAN faced a hurdle at " + hurdles[q][0] + "," + hurdles[q][1]);
                        y+= 1;
                        move=4;

                    }
                }
                move=4;

                break;
        }

        System.out.println("Current poition of packman is:" + x + "," + y);









        int [] a={x,y,move};
        return a;



    }







}


class Enemy{
    public int move1;
    public int move2;
    int x1=5;
    int y1=3;
    int x=7;
    int y=6;
    Random t = new Random();
    public int[] E1move(){





        int pos1 = (t.nextInt(5));
        if (pos1 == 1) {
            x1 += 1;
            move1=1;


        } else if (pos1 == 2) {
            x1 -= 1;
            move1=2;
        } else if (pos1 == 3) {
            y1 += 1;
            move1=3;
        } else {

            y1 -= 1;
            move1=4;
        }












        System.out.println("Current position of Enemy1 is:" + x1 + " ," + y1);
        int [] b={x1,y1,move1};
        return b;












    }




    public int[] E2move(){
        int move2;




        int pos2 = (t.nextInt(5));
        if (pos2 == 1) {
            x += 1;
            move2=1;

        } else if (pos2 == 2) {
            x -= 1;
            move2=2;
        } else if (pos2 == 3) {
            y += 1;
             move2=3;
        } else {

            y -= 1;
            move2=4;
        }



        System.out.println("Current position of Enemy2 is:" + x + " ," + y);
        int[] c={x,y,move2};
        return c;












    }


}


public class pacmann {
    public static void main(String[] args) {
        System.out.println("<<<<<<<<-------PACMAN GAME-------->>>>>>>>>>");
        System.out.println("          Initial position of packman is:(8,7)");
        Maze ma=new Maze();
        Packman p = new Packman();
        Enemy E1 = new Enemy();
        Enemy E2 = new Enemy();
        gameplay g=new gameplay();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of steps:");
        int m=sc.nextInt();
        ma.loadmaze();
        for (int i = 0; i < m; i++) {
            p.Pmove();
            if (E1.y<ma.bound[0].length){
                E1.E1move();
            }
            if (E2.y<ma.bound[0].length){
                E2.E2move();
            }


            ma.plays(p.x,p.y,p.move,E1.x1,E1.y1,E1.move1,E2.x,E2.y,E2.move2);

            if (g.play(p.x,p.y,E1.x, E1.y,E2.x,E2.y)){
                System.out.println("Position Same ");
                break;
            }
            ma.print(ma.bound);
        }
        System.out.println("        @@@@  GAME OVER  @@@@      ");
        System.out.println("           DO YOU WANT TO PLAY AGAIN    yes/no?         ");
        Scanner sec=new Scanner(System.in);
        String str=sec.nextLine();
        if(str.equals("yes")){
            main(null);
        }
        else{
            System.out.println( "          GAME END          ");
        }
    }
}


