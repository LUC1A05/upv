#1.ariketa
sa<-c(0,2,3,2,4,1,2,3,3,0,2,6,2,1,2,3,1,2,3,1,2,7, 2, 1, 4, 2, 3, 3, 1, 0)
#a
table(sa)
#b
a<-table(sa)
barplot(a, main="barra grafikoa",xlab="seme alaba kopurua",ylab="Maiztasuna", col=blues9)

met<-cumsum(a)
plot(met,type="s",main="metatua",xlab="seme alaba kopurua", ylab="maiz met")

#c
moda<-names(table(sa))[which(table(sa)==max(table(sa)))]
moda
mediana<-median(sa)
bbt<-mean(sa)
bbt

#d
heina<-max(sa)-min(sa)
IQR(sa,type=2)#RIC
N<-length(sa)
bariantza<-var(sa)*(N-1)/N
des.tip<-sqrt(bariantza)
ald.koe<-des.tip/mean(sa)

#e
quantile(sa,0.5,type=2)
quantile(sa,0.1,type=2)
quantile(sa,0.4, type=2)
quantile(sa,0.9,type=2)
quantile(sa,0.3,type=2)
quantile(sa,0.85,type=2)

#f
library(moments)
skewness(sa)
kurtosis(sa)-3

#g
boxplot(sa, horizontal=T,col="gold",type=2)

#2.ariketa
x_i_txakur<-c(2,3,4,5,8)
f_i_txakur<-c(2,4,3,4,1)
x_i_elefante<-c(3500,4000,4500,5000,5500)
f_i_elefante<-c(2,4,3,4,2)

bbt.txakur<-weighted.mean(x_i_txakur,f_i_txakur)
dt.txakur<-sqrt(sum(f_i_txakur*(x_i_txakur-bbt.txakur)^2)/sum(f_i_txakur))

bbt.ele<-weighted.mean(x_i_elefante,f_i_elefante)
dt.ele<-sqrt(sum(f_i_elefante*(x_i_elefante-bbt.ele)^2)/sum(f_i_elefante))

(3-bbt.txakur)/dt.txakur
(400-bbt.ele)/dt.ele
#txakurra
#elefantea
#txakurra

#3.ariketa
soldatak<-c(1200,1500,1300,2000,3000)
#a
bbt.sol<-mean(soldatak)
dt.sol<-sqrt(var(soldatak)*(5-1)/5)

#b
soldatak.20<-soldatak*1.2
bbt.sol20<-mean(soldatak.20)
dt.sol20<-sqrt(var(soldatak.20)*(5-1)/5)

#c
soldatak.200<-soldatak+200
bbt.sol200<-mean(soldatak.200)
dt.sol200<-sqrt(var(soldatak.200)*(5-1)/5)

#d
sol.1050<-(soldatak*1.1)+150
bbt.sol1050<-mean(sol.1050)
dt.sol1050<-sqrt(var(sol.1050)*(5-1)/5)

#hirugarrena, gehien irabazten dutenek gehiago irabaziko dutelako c-n baino, eta gutxien irabazten dutenek a-n baino gehiago irabazioko dutelako

#4.ariketa
gaskon<-c(2.1,3.3,4.4,3.0,4.0,5.0,2.7,2.6,4.8,4.7,2.8,4.8,3.9,2.3,3.8,2.8,3.0,3.7,3.3,4.4,3.1,4.0,3.7,2.5,2.7,5.1,4.7)
#a
a<-table(gaskon)
a
hist(gaskon)

#b

