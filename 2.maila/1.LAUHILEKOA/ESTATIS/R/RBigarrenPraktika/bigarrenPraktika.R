#2.PRAKTIKA
#1.ARIKETA
#a
torlojuak<-c(1,2,3,3,2,1,2,5,2,4,4,4,5,3,2,5,3,4,1,4,2,3,1,1,2,5,3,4,1,3)
a<-table(torlojuak)
#b
barplot(a)
#c
izenak<-c("oso mehea","mehea","ertaina","lodia","oso lodia")
pie(a, labels = izenak,main="Sektore-diagrama",xlab="lodierak(mm)", ylab="maiztasuna")

#2.ARIKETA
#a
setwd("C:/Users/lucia/OneDrive/Escritorio/upv/2.maila/1.LAUHILEKOA/ESTATIS/RBigarrenPraktika")
getwd()
ht<-read.table("Hauste_tentsioa.txt", header = TRUE)
#b
print(ht)
#c
ht.1<-ht$Hauste_tentsioa.Tn.cm2.
ht.2<-type.convert(ht.1, as.is = TRUE, dec = ",")
stem(ht.2, scale = 2)
#d
hist(ht.2, main="Histograma", xlab="Tn/cm2", ylab = "maiz", breaks = seq(from = 3.2, to = 5,by = 0.2), col = blues9)
#e
quantile(ht.2,0.25,type = 2)
quantile(ht.2,0.5,type=2)
quantile(ht.2, 0.75, type = 2)
