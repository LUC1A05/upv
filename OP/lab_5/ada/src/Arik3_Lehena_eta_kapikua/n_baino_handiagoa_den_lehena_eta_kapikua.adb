with lehena_da,kapikua_da;
function n_baino_handiagoa_den_lehena_eta_kapikua (n: in integer) return integer is
--aurre: N > 1
--post: emaitza kapikua eta lehena den > N lehenengo balioa izango da
aux: integer:= n + 1;

begin
   loop exit when lehena_da(aux) = True and kapikua_da(aux)=True;
      aux := aux+1;
   end loop;
return(aux);
end n_baino_handiagoa_den_lehena_eta_kapikua;
