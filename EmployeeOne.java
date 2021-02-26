package CodingConvetion;

public class employee {
    int id;
    double salary=0.0;

    public employee(int Id) {

        this.id = id;
    }

    public employee() {

    }

    double calTax(){
           if(this.salary > 500000.00 && this.salary < 1000000)
               return this.salary*0.1;

           else if(this.salary > 1000000.00 && this.salary < 1500000) {
               return this.salary*0.2;
           }
           else
               return this.salary*0.3;


//           for (int index=0;index<10;index++){
//
//           }

    }

}
