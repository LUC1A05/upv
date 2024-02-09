with datuak;
use datuak;

procedure ordenatu (Zerrenda: in out Ikasleen_tutoretza_zerrenda) is
   -- Pre:
   -- Pos: Zerrenda, tutoretzara joandako kopuruan oinarrituta ordanatuta egongo da, handitik txikienereaesta

   Temp : Info_tutoretzak;
begin
   for i in 1..Zerrenda.Zenbat loop
      for j in i+1..Zerrenda.Zenbat loop
         if Zerrenda.Tutoretzak(i).Tutoretzak_Guztira < Zerrenda.Tutoretzak(j).Tutoretzak_Guztira then
            Temp:=Zerrenda.Tutoretzak(i);
            Zerrenda.Tutoretzak(i):=Zerrenda.Tutoretzak(j);
            Zerrenda.Tutoretzak(j):=Temp;
         end if;
      end loop;
   end loop;

end ordenatu;
