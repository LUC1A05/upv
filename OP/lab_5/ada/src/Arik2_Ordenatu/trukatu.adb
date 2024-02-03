-- Author: Ekaitz

procedure trukatu(n1,n2: in out integer) is

    lag: integer;
begin
   if(n1 < n2) then
      lag := n1;
      n1 := n2;
      n2 := lag;
   end if;
end trukatu;
