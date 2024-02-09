-- Author: Ekaitz

with trukatu;

procedure ordenatu_bi_zenbaki(n1,n2: in out integer) is

begin
   if n1 < n2 then
      trukatu(n1, n2);
   end if;

end ordenatu_bi_zenbaki;
