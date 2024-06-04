// Main class
public class d48Q6kadai {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("数値を四つ指定してください");
            return;
        }

        Achievement teamA = new Achievement();
        Achievement teamB = new Achievement();
        try {
            teamA.set(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
            teamB.set(Integer.parseInt(args[2]), Integer.parseInt(args[3]));
        } catch (NumberFormatException e) {
            System.out.println("無効な数値です。整数を入力してください。");
            return;
        }

        Match match = new Match();
        match.setAchievements(teamA, teamB);
        System.out.println(match.showResult());

        int teamAScore = match.winPoint(teamA.getPoint(), teamB.getPoint(), teamA.getTryNumber());
        int teamBScore = match.winPoint(teamB.getPoint(), teamA.getPoint(), teamB.getTryNumber());

        if (teamAScore > teamBScore) {
            System.out.println("チームAの勝利！");
        } else if (teamAScore < teamBScore) {
            System.out.println("チームBの勝利！");
        } else {
            System.out.println("引き分け");
        }
    }
}

// Match class
class Match {
    private Achievement teamA;
    private Achievement teamB;

    void setAchievements(Achievement a, Achievement b) {
        teamA = a;
        teamB = b;
    }

    String showResult() {
        return "Team A: " + winPoint(teamA.getPoint(), teamB.getPoint(), teamA.getTryNumber()) +
               ", Team B: " + winPoint(teamB.getPoint(), teamA.getPoint(), teamB.getTryNumber());
    }

    int winPoint(int teamXPoint, int teamYPoint, int teamXTryNumber) {
        return matchPoint(teamXPoint, teamYPoint) + bonusPoint(teamXTryNumber);
    }

    int matchPoint(int teamXPoint, int teamYPoint) {
        if (teamXPoint == teamYPoint) {
            return 2;
        } else if (teamXPoint > teamYPoint) {
            return 4;
        } else if (teamYPoint - teamXPoint <= 7) {
            return 1;
        }
        return 0;
    }

    int bonusPoint(int tryNumber) {
        return tryNumber >= 4 ? 1 : 0;
    }
}

// Achievement class
class Achievement {
    private int point;
    private int tryNumber;

    void set(int teamPoint, int teamTryNumber) {
        this.point = teamPoint;
        this.tryNumber = teamTryNumber;
    }

    int getPoint() {
        return point;
    }

    int getTryNumber() {
        return tryNumber;
    }
}

