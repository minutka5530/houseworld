public class Main {
    public static void main(String[] args) {
        var fiend = 19;
        fiend = fiend + 2;
        fiend = fiend / 3;
        System.out.println(fiend);
        var frog = 3.5;
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var sport = 78.2;
        var sport2 =82.7;
        var wheight = sport + sport2;
        System.out.println(wheight);

        System.out.println(" разница между бойцами " + (sport2-sport));
        var wheight1 = sport2 % sport;
        System.out.println("Разница между бойцами " + wheight1);
        var wach = 640;
        var wach2 = 8;
        var worldHuman = wach / wach2;
        System.out.println("Всего работников в компании " + worldHuman + " человек" );
        worldHuman = worldHuman + 94;
        var totalHuman = worldHuman * wach2;
        System.out.println(totalHuman);


     }

}