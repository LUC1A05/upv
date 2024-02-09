-- Author: EUITI
with ADA.Text_IO,ADA.Integer_Text_IO;
use ADA.Text_IO,ADA.Integer_Text_IO;

with ordenatu_hiru_zenbaki;

procedure ordenatu_hiru_zenbaki_proba is
n1,n2,n3: integer;
    
begin
    put_line("Aurreneko proba: n1=5, n2=3 eta n3=1");
    n1:=5;
    n2:=3;
    n3:=1;
    put_line("ordena zuzena hau da 5 3 1");
    put_line("eta zuen programak dio:     ");
    ordenatu_hiru_zenbaki(n1,n2,n3);
    put(n1);
    put(n2);
    put(n3);
    new_line(2);
    
    put_line("Bigarren proba: n1=5, n2=1 eta n3=3");
    n1:=5;
    n2:=1;
    n3:=3;
    put_line("ordena zuzena hau da 5 3 1");
    put_line("eta zuen programak dio:     ");
    ordenatu_hiru_zenbaki(n1,n2,n3);
    put(n1);
    put(n2);
    put(n3);
    new_line(2);

    put_line("Hirugarren proba: n1=3, n2=5 eta n3=1");
    n1:=5;
    n2:=1;
    n3:=3;
    put_line("ordena zuzena hau da 5 3 1");
    put_line("eta zuen programak dio:     ");
    ordenatu_hiru_zenbaki(n1,n2,n3);
    put(n1);
    put(n2);
    put(n3);
    new_line(2);    
    

   put_line("Laugarren proba: n1=3, n2=1 eta n3=5");
    n1:=5;
    n2:=1;
    n3:=3;
    put_line("ordena zuzena hau da 5 3 1");
    put_line("eta zuen programak dio:     ");
    ordenatu_hiru_zenbaki(n1,n2,n3);
    put(n1);
    put(n2);
    put(n3);
    new_line(2);    

    put_line("Bostgarren proba: n1=1, n2=1 eta n3=3");
    n1:=1;
    n2:=1;
    n3:=3;
    put_line("ordena zuzena hau da 3 1 1");
    put_line("eta zuen programak dio:     ");
    ordenatu_hiru_zenbaki(n1,n2,n3);
    put(n1);
    put(n2);
    put(n3);
    new_line(2);    

    put_line("Seigarren proba: n1=5, n2=5 eta n3=5");
    n1:=5;
    n2:=5;
    n3:=5;
    put_line("ordena zuzena hau da 5 5 5");
    put_line("eta zuen programak dio:     ");
    ordenatu_hiru_zenbaki(n1,n2,n3);
    put(n1);
    put(n2);
    put(n3);
    new_line(2);    

end ordenatu_hiru_zenbaki_proba;
