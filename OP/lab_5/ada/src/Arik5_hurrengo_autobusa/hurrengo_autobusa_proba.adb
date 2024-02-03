with Ada.Text_IO,Ada.Integer_Text_IO,Ada.Float_Text_IO;
use Ada.Text_IO,Ada.Integer_Text_IO,Ada.Float_Text_IO;
with hurrengo_autobusa;
with autobus_mota;
with irteera_maiztasuna;

procedure hurrengo_autobusa_proba is
   -- Programa honek hurrengo_autobusa azpiprograma probatzeko balio du
   -- hainbat proba kasu desberdin egiaztatuz

   bus_kodea, ordu, minutu, emaitza, zuzena: Integer;
   egun_mota: Character;

begin
    -- 1 proba kasua - eneuntziatuan ematen dena
   bus_kodea:= 10001;
   ordu:= 13;
   minutu:=37;
   egun_mota:='A';
   zuzena:= 3;
   emaitza:=hurrengo_autobusa(bus_kodea, ordu, minutu, egun_mota);
   put_line("1. kasua: " & egun_mota'img & " motako egun bateko " & ordu'image & "ak eta " & minutu'image & " dira");
   put_line(bus_kodea'img & " kodeko hurrengo autobusa " & zuzena'img & " minututan ateratzen da");
   put_line("   eta zure programaren arabera: " & emaitza'img & " minutu falta dira");
   new_line;
   put_line("#################################");
   Put_Line("jarraitzeko enter sakatu");
   Skip_Line;
   New_Line(2);


   -- 2 proba kasua - enuntziatukoa baina jaiegun batean
   bus_kodea:= 10001;
   ordu:= 13;
   minutu:=37;
   egun_mota:='J';
   zuzena:=8;
   emaitza:=hurrengo_autobusa(bus_kodea, ordu, minutu, egun_mota);
   put_line("2. kasua: " & egun_mota'img & " motako egun bateko " & ordu'image & "ak eta " & minutu'image & " dira");
   put_line(bus_kodea'img & " kodeko hurrengo autobusa " & zuzena'img & " minututan ateratzen da");
   put_line("   eta zure programaren arabera: " & emaitza'img & " minutu falta dira");
   new_line;
   put_line("#################################");
   Put_Line("jarraitzeko enter sakatu");
   Skip_Line;
   New_Line(2);


   -- 3 proba kasua - enuntziatukoa baino 0 minutu faltatzeko aldatuta
   bus_kodea:= 10001;
   ordu:= 13;
   minutu:= 40;
   egun_mota:= 'A';
   zuzena:= 0;
   emaitza:=hurrengo_autobusa(bus_kodea, ordu, minutu, egun_mota);
   put_line("3. kasua: " & egun_mota'img & " motako egun bateko " & ordu'image & "ak eta " & minutu'image & " dira");
   put_line(bus_kodea'img & " kodeko hurrengo autobusa " & zuzena'img & " minututan ateratzen da");
   put_line("   eta zure programaren arabera: " & emaitza'img & " minutu falta dira");
   new_line;
   put_line("#################################");
   Put_Line("jarraitzeko enter sakatu");
   Skip_Line;
   New_Line;
   Put_Line("nire proba kasuak");
   New_Line(2);

   -- 1 autobus mota - eneuntziatuan ematen dena
   new_line;
   put_line("1.autobus mota");
   new_line;
   Put_Line("jarraitzeko enter sakatu");
   Skip_Line;

   bus_kodea:= 10001;
   ordu:= 13;
   minutu:=37;
   egun_mota:='A';
   zuzena:= 3;
   emaitza:= hurrengo_autobusa(bus_kodea, ordu, minutu, egun_mota);
   put_line("1. kasua: " & egun_mota'img & " motako egun bateko " & ordu'image & "ak eta " & minutu'image & " dira");
   put_line(bus_kodea'img & " kodeko hurrengo autobusa " & zuzena'img & " minututan ateratzen da");
   put_line("   eta zure programaren arabera: " & emaitza'img & " minutu falta dira");
   new_line;
   put_line("#################################");
   New_Line(2);

   bus_kodea:= 10001;
   ordu:= 13;
   minutu:=37;
   egun_mota:='J';
   zuzena:=8;
   emaitza:=hurrengo_autobusa(bus_kodea, ordu, minutu, egun_mota);
   put_line("2. kasua: " & egun_mota'img & " motako egun bateko " & ordu'image & "ak eta " & minutu'image & " dira");
   put_line(bus_kodea'img & " kodeko hurrengo autobusa " & zuzena'img & " minututan ateratzen da");
   put_line("   eta zure programaren arabera: " & emaitza'img & " minutu falta dira");
   new_line;
   put_line("#################################");
   New_Line(2);

   bus_kodea:= 10001;
   ordu:= 13;
   minutu:=37;
   egun_mota:='L';
   zuzena:=8;
   emaitza:=hurrengo_autobusa(bus_kodea, ordu, minutu, egun_mota);
   put_line("3. kasua: " & egun_mota'img & " motako egun bateko " & ordu'image & "ak eta " & minutu'image & " dira");
   put_line(bus_kodea'img & " kodeko hurrengo autobusa " & zuzena'img & " minututan ateratzen da");
   put_line("   eta zure programaren arabera: " & emaitza'img & " minutu falta dira");
   new_line;
   put_line("#################################");
   New_Line(2);

   -- 2 autobus mota - enuntziatukoa baina jaiegun batean
   new_line;
   put_line("2.autobus mota");
   new_line;
   Put_Line("jarraitzeko enter sakatu");
   Skip_Line;

   bus_kodea:= 20000;
   ordu:= 13;
   minutu:=37;
   egun_mota:='A';
   zuzena:=3;
   emaitza:=hurrengo_autobusa(bus_kodea, ordu, minutu, egun_mota);
   put_line("1. kasua: " & egun_mota'img & " motako egun bateko " & ordu'image & "ak eta " & minutu'image & " dira");
   put_line(bus_kodea'img & " kodeko hurrengo autobusa " & zuzena'img & " minututan ateratzen da");
   put_line("   eta zure programaren arabera: " & emaitza'img & " minutu falta dira");
   new_line;
   put_line("#################################");
   New_Line(2);

   bus_kodea:= 20000;
   ordu:= 13;
   minutu:=37;
   egun_mota:='L';
   zuzena:=3;
   emaitza:=hurrengo_autobusa(bus_kodea, ordu, minutu, egun_mota);
   put_line("2. kasua: " & egun_mota'img & " motako egun bateko " & ordu'image & "ak eta " & minutu'image & " dira");
   put_line(bus_kodea'img & " kodeko hurrengo autobusa " & zuzena'img & " minututan ateratzen da");
   put_line("   eta zure programaren arabera: " & emaitza'img & " minutu falta dira");
   new_line;
   put_line("#################################");
   New_Line(2);

   bus_kodea:= 20000;
   ordu:= 13;
   minutu:=37;
   egun_mota:='J';
   zuzena:=23;
   emaitza:=hurrengo_autobusa(bus_kodea, ordu, minutu, egun_mota);
   put_line("3. kasua: " & egun_mota'img & " motako egun bateko " & ordu'image & "ak eta " & minutu'image & " dira");
   put_line(bus_kodea'img & " kodeko hurrengo autobusa " & zuzena'img & " minututan ateratzen da");
   put_line("   eta zure programaren arabera: " & emaitza'img & " minutu falta dira");
   new_line;
   put_line("#################################");
   New_Line(2);

   bus_kodea:= 30000;
   ordu:= 13;
   minutu:=37;
   egun_mota:='A';
   zuzena:=3;
   emaitza:=hurrengo_autobusa(bus_kodea, ordu, minutu, egun_mota);
   put_line("4. kasua: " & egun_mota'img & " motako egun bateko " & ordu'image & "ak eta " & minutu'image & " dira");
   put_line(bus_kodea'img & " kodeko hurrengo autobusa " & zuzena'img & " minututan ateratzen da");
   put_line("   eta zure programaren arabera: " & emaitza'img & " minutu falta dira");
   new_line;
   put_line("#################################");
   New_Line(2);

   bus_kodea:= 30000;
   ordu:= 13;
   minutu:=37;
   egun_mota:='L';
   zuzena:=3;
   emaitza:=hurrengo_autobusa(bus_kodea, ordu, minutu, egun_mota);
   put_line("5. kasua: " & egun_mota'img & " motako egun bateko " & ordu'image & "ak eta " & minutu'image & " dira");
   put_line(bus_kodea'img & " kodeko hurrengo autobusa " & zuzena'img & " minututan ateratzen da");
   put_line("   eta zure programaren arabera: " & emaitza'img & " minutu falta dira");
   new_line;
   put_line("#################################");
   New_Line(2);

   bus_kodea:= 30000;
   ordu:= 13;
   minutu:=37;
   egun_mota:='J';
   zuzena:=23;
   emaitza:=hurrengo_autobusa(bus_kodea, ordu, minutu, egun_mota);
   put_line("6. kasua: " & egun_mota'img & " motako egun bateko " & ordu'image & "ak eta " & minutu'image & " dira");
   put_line(bus_kodea'img & " kodeko hurrengo autobusa " & zuzena'img & " minututan ateratzen da");
   put_line("   eta zure programaren arabera: " & emaitza'img & " minutu falta dira");
   new_line;
   put_line("#################################");
   New_Line(2);


   -- 3 autobus mota - enuntziatukoa baino 0 minutu faltatzeko aldatuta
   new_line;
   put_line("3.autobus mota");
   new_line;
   Put_Line("jarraitzeko enter sakatu");
   Skip_Line;

   bus_kodea:= 48001;
   ordu:= 17;
   minutu:= 05;
   egun_mota:= 'J';
   zuzena:= 25;
   emaitza:=hurrengo_autobusa(bus_kodea, ordu, minutu, egun_mota);
   put_line("1. kasua: " & egun_mota'img & " motako egun bateko " & ordu'image & "ak eta " & minutu'image & " dira");
   put_line(bus_kodea'img & " kodeko hurrengo autobusa " & zuzena'img & " minututan ateratzen da");
   put_line("   eta zure programaren arabera: " & emaitza'img & " minutu falta dira");
   new_line;
   put_line("#################################");
   New_Line(2);

   bus_kodea:= 48001;
   ordu:= 17;
   minutu:= 05;
   egun_mota:= 'A';
   zuzena:= 25;
   emaitza:=hurrengo_autobusa(bus_kodea, ordu, minutu, egun_mota);
   put_line("2. kasua: " & egun_mota'img & " motako egun bateko " & ordu'image & "ak eta " & minutu'image & " dira");
   put_line(bus_kodea'img & " kodeko hurrengo autobusa " & zuzena'img & " minututan ateratzen da");
   put_line("   eta zure programaren arabera: " & emaitza'img & " minutu falta dira");
   new_line;
   put_line("#################################");
   New_Line(2);

   bus_kodea:= 48001;
   ordu:= 17;
   minutu:= 05;
   egun_mota:= 'L';
   zuzena:= 25;
   emaitza:=hurrengo_autobusa(bus_kodea, ordu, minutu, egun_mota);
   put_line("3. kasua: " & egun_mota'img & " motako egun bateko " & ordu'image & "ak eta " & minutu'image & " dira");
   put_line(bus_kodea'img & " kodeko hurrengo autobusa " & zuzena'img & " minututan ateratzen da");
   put_line("   eta zure programaren arabera: " & emaitza'img & " minutu falta dira");
   new_line;
   put_line("#################################");
   New_Line(2);

      -- 4 autobus mota - enuntziatukoa baino 0 minutu faltatzeko aldatuta
   new_line;
   put_line("4.autobus mota");
   new_line;
   Put_Line("jarraitzeko enter sakatu");
   Skip_Line;

   bus_kodea:= 430;
   ordu:= 17;
   minutu:= 05;
   egun_mota:= 'A';
   zuzena:= 55;
   emaitza:=hurrengo_autobusa(bus_kodea, ordu, minutu, egun_mota);
   put_line("1. kasua: " & egun_mota'img & " motako egun bateko " & ordu'image & "ak eta " & minutu'image & " dira");
   put_line(bus_kodea'img & " kodeko hurrengo autobusa " & zuzena'img & " minututan ateratzen da");
   put_line("   eta zure programaren arabera: " & emaitza'img & " minutu falta dira");
   new_line;
   put_line("#################################");
   New_Line(2);

   bus_kodea:= 430;
   ordu:= 17;
   minutu:= 05;
   egun_mota:= 'L';
   zuzena:= 55;
   emaitza:=hurrengo_autobusa(bus_kodea, ordu, minutu, egun_mota);
   put_line("2. kasua: " & egun_mota'img & " motako egun bateko " & ordu'image & "ak eta " & minutu'image & " dira");
   put_line(bus_kodea'img & " kodeko hurrengo autobusa " & zuzena'img & " minututan ateratzen da");
   put_line("   eta zure programaren arabera: " & emaitza'img & " minutu falta dira");
   new_line;
   put_line("#################################");
   New_Line(2);

   bus_kodea:= 430;
   ordu:= 17;
   minutu:= 05;
   egun_mota:= 'J';
   zuzena:= 175;
   emaitza:=hurrengo_autobusa(bus_kodea, ordu, minutu, egun_mota);
   put_line("3. kasua: " & egun_mota'img & " motako egun bateko " & ordu'image & "ak eta " & minutu'image & " dira");
   put_line(bus_kodea'img & " kodeko hurrengo autobusa " & zuzena'img & " minututan ateratzen da");
   put_line("   eta zure programaren arabera: " & emaitza'img & " minutu falta dira");
   new_line;
   put_line("#################################");
   New_Line(2);

   bus_kodea:= 4300;
   ordu:= 17;
   minutu:= 05;
   egun_mota:= 'A';
   zuzena:= 55;
   emaitza:=hurrengo_autobusa(bus_kodea, ordu, minutu, egun_mota);
   put_line("4. kasua: " & egun_mota'img & " motako egun bateko " & ordu'image & "ak eta " & minutu'image & " dira");
   put_line(bus_kodea'img & " kodeko hurrengo autobusa " & zuzena'img & " minututan ateratzen da");
   put_line("   eta zure programaren arabera: " & emaitza'img & " minutu falta dira");
   new_line;
   put_line("#################################");
   New_Line(2);

   bus_kodea:= 4300;
   ordu:= 17;
   minutu:= 05;
   egun_mota:= 'L';
   zuzena:= 55;
   emaitza:=hurrengo_autobusa(bus_kodea, ordu, minutu, egun_mota);
   put_line("5. kasua: " & egun_mota'img & " motako egun bateko " & ordu'image & "ak eta " & minutu'image & " dira");
   put_line(bus_kodea'img & " kodeko hurrengo autobusa " & zuzena'img & " minututan ateratzen da");
   put_line("   eta zure programaren arabera: " & emaitza'img & " minutu falta dira");
   new_line;
   put_line("#################################");
   New_Line(2);

   bus_kodea:= 4300;
   ordu:= 17;
   minutu:= 05;
   egun_mota:= 'J';
   zuzena:= 175;
   emaitza:=hurrengo_autobusa(bus_kodea, ordu, minutu, egun_mota);
   put_line("6. kasua: " & egun_mota'img & " motako egun bateko " & ordu'image & "ak eta " & minutu'image & " dira");
   put_line(bus_kodea'img & " kodeko hurrengo autobusa " & zuzena'img & " minututan ateratzen da");
   put_line("   eta zure programaren arabera: " & emaitza'img & " minutu falta dira");
   new_line;
   put_line("#################################");
   New_Line(2);


   -- 5 autobus mota - enuntziatukoa baino 0 minutu faltatzeko aldatuta
   new_line;
   put_line("5.autobus mota");
   new_line;
   Put_Line("jarraitzeko enter sakatu");
   Skip_Line;

   bus_kodea:= 340000;
   ordu:= 00;
   minutu:= 40;
   egun_mota:= 'A';
   zuzena:= 440;
   emaitza:=hurrengo_autobusa(bus_kodea, ordu, minutu, egun_mota);
   put_line("1. kasua: " & egun_mota'img & " motako egun bateko " & ordu'image & "ak eta " & minutu'image & " dira");
   put_line(bus_kodea'img & " kodeko hurrengo autobusa " & zuzena'img & " minututan ateratzen da");
   put_line("   eta zure programaren arabera: " & emaitza'img & " minutu falta dira");
   new_line;
   put_line("#################################");
   New_Line(2);

   bus_kodea:= 340000;
   ordu:= 00;
   minutu:= 40;
   egun_mota:= 'L';
   zuzena:= 440;
   emaitza:=hurrengo_autobusa(bus_kodea, ordu, minutu, egun_mota);
   put_line("2. kasua: " & egun_mota'img & " motako egun bateko " & ordu'image & "ak eta " & minutu'image & " dira");
   put_line(bus_kodea'img & " kodeko hurrengo autobusa " & zuzena'img & " minututan ateratzen da");
   put_line("   eta zure programaren arabera: " & emaitza'img & " minutu falta dira");
   new_line;
   put_line("#################################");
   New_Line(2);

   bus_kodea:= 340000;
   ordu:= 00;
   minutu:= 40;
   egun_mota:= 'J';
   zuzena:= 680;
   emaitza:=hurrengo_autobusa(bus_kodea, ordu, minutu, egun_mota);
   put_line("3. kasua: " & egun_mota'img & " motako egun bateko " & ordu'image & "ak eta " & minutu'image & " dira");
   put_line(bus_kodea'img & " kodeko hurrengo autobusa " & zuzena'img & " minututan ateratzen da");
   put_line("   eta zure programaren arabera: " & emaitza'img & " minutu falta dira");
   new_line;
   put_line("#################################");
   New_Line(2);

   -- 6 autobus mota - enuntziatukoa baino 0 minutu faltatzeko aldatuta
   new_line;
   put_line("6.autobus mota");
   new_line;
   Put_Line("jarraitzeko enter sakatu");
   Skip_Line;

   bus_kodea:= 1;
   ordu:= 00;
   minutu:= 40;
   egun_mota:= 'J';
   zuzena:= 20;
   emaitza:=hurrengo_autobusa(bus_kodea, ordu, minutu, egun_mota);
   put_line("1. kasua: " & egun_mota'img & " motako egun bateko " & ordu'image & "ak eta " & minutu'image & " dira");
   put_line(bus_kodea'img & " kodeko hurrengo autobusa " & zuzena'img & " minututan ateratzen da");
   put_line("   eta zure programaren arabera: " & emaitza'img & " minutu falta dira");
   new_line;
   put_line("#################################");
   New_Line(2);

   bus_kodea:= 1;
   ordu:= 00;
   minutu:= 40;
   egun_mota:= 'A';
   zuzena:= 20;
   emaitza:=hurrengo_autobusa(bus_kodea, ordu, minutu, egun_mota);
   put_line("2. kasua: " & egun_mota'img & " motako egun bateko " & ordu'image & "ak eta " & minutu'image & " dira");
   put_line(bus_kodea'img & " kodeko hurrengo autobusa " & zuzena'img & " minututan ateratzen da");
   put_line("   eta zure programaren arabera: " & emaitza'img & " minutu falta dira");
   new_line;
   put_line("#################################");
   New_Line(2);

   bus_kodea:= 1;
   ordu:= 00;
   minutu:= 40;
   egun_mota:= 'L';
   zuzena:= 20;
   emaitza:=hurrengo_autobusa(bus_kodea, ordu, minutu, egun_mota);
   put_line("3. kasua: " & egun_mota'img & " motako egun bateko " & ordu'image & "ak eta " & minutu'image & " dira");
   put_line(bus_kodea'img & " kodeko hurrengo autobusa " & zuzena'img & " minututan ateratzen da");
   put_line("   eta zure programaren arabera: " & emaitza'img & " minutu falta dira");
   new_line;
   put_line("#################################");
   New_Line(2);
   Put_Line("jarraitzeko enter sakatu");
   Skip_Line;



end hurrengo_autobusa_proba;
