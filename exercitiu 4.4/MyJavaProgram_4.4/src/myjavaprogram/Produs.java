package myjavaprogram;

public abstract class Produs {

    public int type;
    public String name;
    public double price;
    public String[] additions;

    public abstract double countPrice();

    @Override
    public String toString() {
        return "Produs: " + this.name + ", " + "preţ: " + countPrice() + ", " + "adaosuri: " + allAdditions();
    }


    public String allAdditions() {

        StringBuilder output = new StringBuilder();  
        for (int i = 0; i < this.additions.length; i++) {
            if (this.additions[i] != null) {
                output.append(this.additions[i] + ", ");
            }
        }

        if (!output.toString().equals("")) {
            if (output.toString().trim().endsWith(",")) {
                output.replace(output.length() - 2, output.length(), "");
            }
        } else {
            output.append("fără adaosuri");
        }
        return output.toString();
    }

    public void addition(String addition) {

        for (int i = 0; i < this.additions.length; i++) {
            if (this.additions[i] == null) {
                this.additions[i] = addition;
                break;
            }
        }
    }
}
