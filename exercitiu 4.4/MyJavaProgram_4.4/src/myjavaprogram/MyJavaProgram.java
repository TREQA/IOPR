package myjavaprogram;

public class MyJavaProgram {

    /*Exerciţiul nr. 1
Pentru aplicaţia unui restaurant de fast food, trebuie creată clasa
abstractă Produs. Această clasă conţine proprietăţi publice: int
tipProdus, String nume şi double preţul de bază, precum şi un şir de
stringuri adaosuri, care poate conţine cel mult 10 adaosuri. De
asemenea, această clasă conţine şi metoda introducere adaos care
introduce adaosul pentru produs (salată, condimente etc.) şi metoda
toateAdaosurile, care returnează toate adaosurile sub formă de string.
Clasa trebuie să aibă şi o metodă abstractă, calcularePreţ, care va
calcula preţul pe baza tipului de produs. În timpul calculării preţului
produsului, trebuie să aveţi grijă la taxa pentru pizza de 10%, în timp
ce taxa pentru sendvişuri este de 15%.
Clasa trebuie să posede şi metoda suprascrisă toString care va afişa
datele despre produs în următoarea formă:
Produs: pizza, preţ: 25,45, adaosuri: roşii, muştar, maioneză.
Trebuie create clasele Pizza şi Sendviş care moştenesc clasa Produs şi
trebuie creat codul pentru crearea unei instanţe a claselor Pizza şi
Sendviş în metoda Main. Clasele Pizza şi Sendviş necesită în
constructor numele şi preţul produsului.*/
    public static void main(String[] args) {

        System.out.println("ex 1");
        Pizza p = new Pizza("Capriciossa", 25);

        p.addition("roşii");
        p.addition("smântână");

        Sandwich s = new Sandwich("Sendviş cu şuncă", 35);

        p.addition("castravete");
        p.addition("ceapă");
        p.addition("roşii");

        System.out.println(p);
        System.out.println(s);


        /*Exerciţiul nr. 2
Trebuie creată clasa abstractă Quad care va conţine 3 câmpuri
(x, y şi a) şi o metodă abstractă (Setxya).
Trebuie creată interfaţa IGeom care va conţine semnăturile
metodelor pentru calcularea ariei şi a perimetrului.
Trebuie creată clasă Square care moşteneşte clasa Quad şi
implementează interfaţa IGeom.
Trebuie creată o instanţă a clasei Square în programul
principal.*/
        System.out.println("ex 2");
        Square sq = new Square();

        sq.setxya(100, 100, 5);
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        /*Exerciţiul nr. 3

Sunt necesare două interfeţe pentru aplicaţia calculator (de
buzunar): Operands şi Operations. Operands conţine semnătura
metodei setOperands care pune operanzii la valorile iniţiale, în
timp ce Operations conţine semnături ale metodelor cu operaţii
(sunt suficente doar două).
Trebuie creată clasa Calculator care va implementa interfeţele
Operands şi Operations.
Trebuie instanţiată clasa Calculator în aplicaţia principală şi
trebuie activate metodele sale Adunare şi Scădere.*/
        System.out.println("ex 3");
        Calculator calc = new Calculator();

        calc.setOperands(4, 5);

        System.out.println(calc.add());
        System.out.println(calc.div());

    }
}
