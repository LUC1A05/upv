-- Author: Ekaitz

with ordenatu_bi_zenbaki;
procedure ordenatu_hiru_zenbaki(n1,n2,n3: in out integer) is
---sarrera: 3 zenbaki
    --aurre: hiru balioak desberdinak izango dira
---irteera: 3 zenbaki
---Post: ordenatuta egongo dira, handitik txikira
begin
   ordenatu_bi_zenbaki(n1, n2);
   ordenatu_bi_zenbaki(n2, n3);
   ordenatu_bi_zenbaki(n1, n2);
end ordenatu_hiru_zenbaki;
