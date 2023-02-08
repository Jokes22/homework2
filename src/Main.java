public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        System.out.println(boxer1);
        System.out.println(boxer2);
        var TotalWeight = boxer1 + boxer2;
        System.out.println(TotalWeight);
        var distinction = boxer2 - boxer1;
        System.out.println(distinction);
        var remainder = boxer2 % boxer1;
        System.out.println(remainder);

        var time = 640;
        var worktime = 8;
        var worker = time / worktime;
        System.out.println("Всего работников в компании " + worker + " человек");
        var worker2 = worker + 94;
        var worktime2 = time / worker2;
        System.out.println("Если в компании работает " + worker2 + " человек, то всего " + worktime2 + " часов работы может быть поделено между сотрудниками.");
    }
}