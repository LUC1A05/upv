with Ada.Integer_Text_IO,Ada.Text_IO;
use Ada.Integer_Text_IO,Ada.Text_IO;

with hamartarretik_bitarrera;

procedure hamartarretik_bitarrera_proba is

zenb_hamartar,zenb_bitar:integer;


begin
    put_line("Aurreneko proba: 1");
    put("Zure programak 1 itzuli beharko luke!");
    new_line;
    zenb_hamartar:=1;
    zenb_bitar:=hamartarretik_bitarrera(zenb_hamartar);
    put("eta zure programa ondoko itzuli du:");
    put(zenb_bitar);
    new_line;
    put("Sakatu enter jarraitzeko");
    Skip_Line;
    new_line;
    
    put_line("Bigarren proba: 2");
    put("Zure programak 10 itzuli beharko luke!");
    new_line;
    zenb_hamartar:=2;
    zenb_bitar:=hamartarretik_bitarrera(zenb_hamartar);
    put("eta zure programa ondoko itzuli du:");
    put(zenb_bitar);
    new_line;
    put("Sakatu enter jarraitzeko");
    Skip_Line;
    new_line;

    put_line("Hirugarren proba: 8");
    put("Zure programak 1000 itzuli beharko luke!");
    new_line;
    zenb_hamartar:=8; --bete
    zenb_bitar:=hamartarretik_bitarrera(zenb_hamartar);
    put("eta zure programa ondoko itzuli du:");
    put(zenb_bitar);
    new_line;
    put("Sakatu enter jarraitzeko");
    Skip_Line;
    new_line;

    put_line("Laugarren proba: 9");
    put("Zure programak 1001 itzuli beharko luke!");
    new_line;
    zenb_hamartar:=9; --bete
    zenb_bitar:=hamartarretik_bitarrera(zenb_hamartar);
    put("eta zure programa ondoko itzuli du:");
    put(zenb_bitar);
    new_line;
    put("Sakatu enter jarraitzeko");
    Skip_Line;
    new_line;
    
end hamartarretik_bitarrera_proba;
