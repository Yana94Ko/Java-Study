package homework.day05.nation.nation;

/*과제1 멤버변수 선언*/ 
public class Nation {
    /*과제3 접근 제어자*/private String countryName;
    /*과제3 접근 제어자*/public int countryArea;
    /*과제3 접근 제어자*/public int population;

    /*과제4 static지정*/static String planetName = "Earth";

    void changeName(String name){
        this.countryName = name;
    }
    void changeArea(int Area){
        this.countryArea = Area;
    }
    void changePopulation(int population){
        this.population = population;
    }
    
    String getName(){
        return countryName;
    }
    int getArea(){
        return countryArea;
    }
    int getPopulation(){
        return population;    
    }
}

/*과제2*/
class Russia extends Nation{
    int putinsPresidentalTerm = 20;
    boolean redBear = true;

    void vote(){
        this.putinsPresidentalTerm += 6;
    }
}
/*과제2*/
class Korea extends Nation{
    boolean kpop = true;
    int kpopAwarness = 50;

    void popularKpop (){
        this.kpopAwarness += 10;
    }
}
/*과제2*/
class Kazakhstan extends Nation{
    boolean hyunah = false;
    int hyunahSalary = 450;

    void covidVirus(){
        this.hyunahSalary = 0;
    }
}