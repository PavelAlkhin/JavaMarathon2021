package day7;

public class Player {
    private int stamina;
    private final static int MAX_STAMINA = 100;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        if(Player.countPlayers < 6)
            Player.countPlayers += 1;
    }

    public static void subPlayer() {
        if (Player.countPlayers > 0)
            Player.countPlayers -= 1;
    }

    public static void addPlayer() {
        if (Player.countPlayers == 6) {
            System.out.println("Не возможно добавить игрока. Команды заполнены.");
            return;
        }
        Player.countPlayers += 1;
        System.out.println("Добавлен игрок в команды. Всего " + getCountPlayers());
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return Player.countPlayers;
    }

    public void run() {
        if (this.stamina > 1) {
            this.stamina--;
            System.out.println("Игрок сделал рывок, выносливость уменьшилась, осталось " + getStamina());

        } else if (this.stamina == 1) {
            this.stamina--;
            System.out.println("Игрок обессилил и покинул команду. ");
            Player.subPlayer();
        }
    }

    public static void info() {
        if (getCountPlayers() < 6) {
            System.out.println(String.format("Команды неполные. На поле еще есть %s свободных мест", 6 - getCountPlayers()));
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
