package demo.Assessment.OOP.TasksToDo8_fromWEBSITE.Excercise_1_OOP_Intro_Class_Instances.Excercise_1_5;

public class InvoiceItem {
    String id;
    String desc;
    int qty;
    double unitPrice;

    public InvoiceItem(String id, String desc, int qty, double unitPrice){
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    // getter
    public String getID(){
        return id;
    }

    public String getDesc(){
        return desc;
    }

    public int getQty(){
        return qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    // setter
    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getTotal(){
        return unitPrice * qty;
    }

    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }

    public String toString(){
        return "InvoiceItem[id=" + id + ",desc=" + desc + ",qty=" + qty +",unitPrice=" +unitPrice +"]";
    }
}
