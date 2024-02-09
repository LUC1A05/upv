with ada.text_io, ada.integer_text_io;
use  ada.text_io, ada.integer_text_io;
with datuak_4;use datuak_4;

function orekatu (T : in     katea) return Boolean is 
-- aurre: T barnean programako lerro bat du, non parentesiak edota giltzak izan ditzakeen
--        Adib:         if (a > b) { b := a+n ) ; x+y }
-- post: emaitza TRUE izango da orekatua badago, bestela FALSE

   Tlag : katea;  
   I    : Integer;  
   J    : Integer; --Tlag-eko azken elementua adieraziko du.     
   Irten : Boolean := True;
   
begin
   Tlag.luzera := 0;
   J := 0;
   I := 1;
   while I <= T.luzera and then Irten = True loop
      if T.karaktereak(I)='(' or T.karaktereak(I)=')' or T.karaktereak(I)='{' or T.karaktereak(I)='}' then
         if T.karaktereak(I) = '(' or T.karaktereak(I) = '{' then
            Tlag.luzera := Tlag.luzera + 1;
            J := J+1;
            Tlag.karaktereak(J) := T.karaktereak(I);
         elsif T.karaktereak(I) = ')' or T.karaktereak(I) = '}' then
            if j=0 then
               Irten:=False;
            else
               if T.karaktereak(I) = ')' then
                  if Tlag.karaktereak(J) = '(' then
                     J := J-1;
                     Tlag.luzera := Tlag.luzera - 1;
                  else
                     Irten := False;
                  end if;
               elsif T.karaktereak(I) = '}' then
                  if Tlag.karaktereak(J) = '{' then
                     J:=J-1;
                     Tlag.luzera := Tlag.luzera - 1;
                  else
                     Irten:= False;
                  end if;
               end if;
            end if;
         end if;
      end if;
      I := I +1;
   end loop;
   if j/=0 then
      return False;
   end if;
   return Irten;
end orekatu;
