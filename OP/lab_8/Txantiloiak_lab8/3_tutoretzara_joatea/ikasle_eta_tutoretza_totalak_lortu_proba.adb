with Ada.Text_IO;
use Ada.Text_IO;
with datuak, ikasle_eta_tutoretza_totalak_lortu;
use datuak;

procedure ikasle_eta_tutoretza_totalak_lortu_proba is
   -- programa honek ikasle_eta_tutoretza_totalak_lortu azpiprogramari deia egingo dio emaitzak aztertzeko

   procedure inprimatu_tutoretzen_informazioa(zerrenda: in Ikasleen_tutoretza_zerrenda) is
   begin
      new_line;
      for ikasZe in 1..zerrenda.Zenbat loop
         put(" * NAN " & zerrenda.Tutoretzak(ikasZe).NAN'img &" joan da " & zerrenda.Tutoretzak(ikasZe).Tutoretzak_Guztira'img & " egun");
         new_line;
      end loop;
   end inprimatu_tutoretzen_informazioa;


   E: Info_egutegia;
   Z: Ikasleen_tutoretza_zerrenda;

begin

   E.Zenbat_egun:= 5;
   E.Egunak(1).Data:="2018/06/18";
   E.Egunak(1).ikasle_kop:= 8;
   E.Egunak(1).Nanak(1):= 11;
   E.Egunak(1).Nanak(2):= 22;
   E.Egunak(1).Nanak(3):= 33;
   E.Egunak(1).Nanak(4):= 11;
   E.Egunak(1).Nanak(5):= 22;
   E.Egunak(1).Nanak(6):= 33;
   E.Egunak(1).Nanak(7):= 44;
   E.Egunak(1).Nanak(8):= 55;

   E.Egunak(2).data:="2018/06/19";
   E.Egunak(2).ikasle_kop:= 3;
   E.Egunak(2).Nanak(1):= 55;
   E.Egunak(2).Nanak(2):= 22;
   E.Egunak(2).Nanak(3):= 55;

   E.Egunak(3).data:="2018/06/20";
   E.Egunak(3).ikasle_kop:= 0;

   E.Egunak(4).data:="2018/06/21";
   E.Egunak(4).ikasle_kop:= 2;
   E.Egunak(4).Nanak(1):= 22;
   E.Egunak(4).Nanak(2):= 33;

   E.Egunak(5).data:="2018/06/22";
   E.Egunak(5).ikasle_kop:= 5;
   E.Egunak(5).Nanak(1):= 44;
   E.Egunak(5).Nanak(2):= 33;
   E.Egunak(5).Nanak(3):= 22;
   E.Egunak(5).Nanak(4):= 44;
   E.Egunak(5).Nanak(5):= 11;

   put_line("PROBA 1 -- Emaitza hau izan beharko luke: ");
   put_line("(berdinketa kasuan berdin lioke ordenak)");
   new_line;
   put_line(" * NAN 22 joan da 4 egun");
   put_line(" * NAN 33 joan da 3 egun");
   put_line(" * NAN 55 joan da 2 egun");
   put_line(" * NAN 44 joan da 2 egun");
   put_line(" * NAN 11 joan da 2 egun");

   new_line;
   put_line("eta zure azpiprogramak dio:");
   ikasle_eta_tutoretza_totalak_lortu(E,Z);
   inprimatu_tutoretzen_informazioa(Z);
   Put_Line("sakatu enter");
   Skip_Line;

   Put_Line("-------------------------");
   Put_Line("|                       |");
   Put_Line("|   Gure proba kasuak   |");
   Put_Line("|                       |");
   Put_Line("-------------------------");
   Put_Line("sakatu enter");
   Skip_Line;

   Put_Line("-------------------------");
   Put_Line("|                       |");
   Put_Line("|       2.kasua         |");
   Put_Line("|                       |");
   Put_Line("-------------------------");

   E.Zenbat_egun:= 5;
   E.Egunak(1).Data:="2023/12/03";
   E.Egunak(1).ikasle_kop:= 1;
   E.Egunak(1).Nanak(1):= 11;


   E.Egunak(2).data:="2023/12/04";
   E.Egunak(2).ikasle_kop:= 3;
   E.Egunak(2).Nanak(1):= 11;
   E.Egunak(2).Nanak(2):= 11;
   E.Egunak(2).Nanak(3):= 11;

   E.Egunak(3).data:="2023/12/05";
   E.Egunak(3).ikasle_kop:= 0;

   E.Egunak(4).data:="2023/12/06";
   E.Egunak(4).ikasle_kop:= 2;
   E.Egunak(4).Nanak(1):= 11;
   E.Egunak(4).Nanak(2):= 11;

   E.Egunak(5).data:="2023/12/07";
   E.Egunak(5).ikasle_kop:= 5;
   E.Egunak(5).Nanak(1):= 11;
   E.Egunak(5).Nanak(2):= 11;
   E.Egunak(5).Nanak(3):= 11;
   E.Egunak(5).Nanak(4):= 11;
   E.Egunak(5).Nanak(5):= 11;

   put_line("PROBA 2 -- Emaitza hau izan beharko luke: ");
   put_line("(berdinketa kasuan berdin lioke ordenak)");
   new_line;
   put_line(" * NAN 11 joan da 4 egun");

   new_line;
   put_line("eta zure azpiprogramak dio:");
   ikasle_eta_tutoretza_totalak_lortu(E,Z);
   inprimatu_tutoretzen_informazioa(Z);
   Put_Line("sakatu enter");
   Skip_Line;

   Put_Line("-------------------------");
   Put_Line("|                       |");
   Put_Line("|       3.kasua         |");
   Put_Line("|                       |");
   Put_Line("-------------------------");

   E.Zenbat_egun:= 1;
   E.Egunak(1).Data:="2023/12/03";
   E.Egunak(1).ikasle_kop:= 1;
   E.Egunak(1).Nanak(1):= 11;

   put_line("PROBA 3 -- Emaitza hau izan beharko luke: ");
   put_line("(berdinketa kasuan berdin lioke ordenak)");
   new_line;
   put_line(" * NAN 11 joan da 1 egun");

   new_line;
   put_line("eta zure azpiprogramak dio:");
   ikasle_eta_tutoretza_totalak_lortu(E,Z);
   inprimatu_tutoretzen_informazioa(Z);
   Put_Line("sakatu enter");
   Skip_Line;

   Put_Line("-------------------------");
   Put_Line("|                       |");
   Put_Line("|       4.kasua         |");
   Put_Line("|                       |");
   Put_Line("-------------------------");

   E.Zenbat_egun:= 2;
   E.Egunak(1).Data:="2023/12/03";
   E.Egunak(1).ikasle_kop:= 2;
   E.Egunak(1).Nanak(1):= 22;
   E.Egunak(1).Nanak(1):= 12;


   E.Egunak(2).data:="2023/12/04";
   E.Egunak(2).ikasle_kop:= 1;
   E.Egunak(2).Nanak(1):= 13;

   put_line("PROBA 4 -- Emaitza hau izan beharko luke: ");
   put_line("(berdinketa kasuan berdin lioke ordenak)");
   new_line;
   put_line(" * NAN 22 joan da 1 egun");
   put_line(" * NAN 12 joan da 1 egun");
   put_line(" * NAN 13 joan da 1 egun");

   new_line;
   put_line("eta zure azpiprogramak dio:");
   ikasle_eta_tutoretza_totalak_lortu(E,Z);
   inprimatu_tutoretzen_informazioa(Z);
   Put_Line("sakatu enter");
   Skip_Line;

   Put_Line("-------------------------");
   Put_Line("|                       |");
   Put_Line("|       5.kasua         |");
   Put_Line("|                       |");
   Put_Line("-------------------------");

   E.Zenbat_egun:= 0;

   put_line("PROBA 5 -- Emaitza hau izan beharko luke: ");
   put_line("(berdinketa kasuan berdin lioke ordenak)");
   new_line;

   new_line;
   put_line("eta zure azpiprogramak dio:");
   ikasle_eta_tutoretza_totalak_lortu(E,Z);
   inprimatu_tutoretzen_informazioa(Z);
   Put_Line("sakatu enter");
   Skip_Line;


end ikasle_eta_tutoretza_totalak_lortu_proba;
