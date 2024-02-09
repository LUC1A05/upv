with Datuak;
use Datuak;

function bataz_bestekoa (
      L : Lista )
  return Float is
   -- aurre: Idatzi ezazu
   -- post: Idatzi ezazu
   bb, i:Float:=0.0;
   Egungoa:Lista:=L;
begin
   while Egungoa /= null loop
      bb:= bb + float(Egungoa.info);
      Egungoa:=Egungoa.Hurrengoa;
      i:= i+1.0;
   end loop;
   return(bb/i);

end bataz_bestekoa;
