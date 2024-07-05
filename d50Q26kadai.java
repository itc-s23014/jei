//23014
//列挙型の課題

enum Condition {ROAD,MUD,SNOW}

class d50Q26kadai {
    public static void main(String[] args) {
        int i = Condition.values().length;
            for(int j = 0;j <i; ++j){
                System.out.println(Condition.values()[j]);
           }
      }
  }
