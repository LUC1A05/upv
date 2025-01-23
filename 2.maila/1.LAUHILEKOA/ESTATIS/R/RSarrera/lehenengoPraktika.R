#R-ko Sarrera
#1.ariketa
#a
((1+2)/(3+4))^2
#b
sqrt(exp(2)+log(3,2))
#c
x<-seq(1,21)
prod(x)#listako elementu guztiak biderkatzen

#2.ariketa
x <- c(20.5,12.6,-23,-6.98,24,32.8,7,-8.6)
f <- c(3,4,2,6,5,7,4,9)

#a
f/sum(f)

#b
sum(x*f)

#c
sum(x^2*f)

#3.ariketa
km <- c(31422,31801,32131,32691,33077,33514,33992)
diff(km) #elementu bat eta bere hurrengoaren arteko aldea adierazten du bektore baten bidez
mean(km) #bektorearen elementuen batezbestekoa
mean(diff(km)) #elementuen diferentziaren batezbestekoa

#4.ariketa

#a
r <- seq(0,1.2,length = 20)

#b
length(r)

#c
range(r)

#d
r[10] <- 1

#e
y <- exp(r)

#g
plot(r,y)
plot(r,y,main="Funtzio esponentziala",xlab="abs baloreak", ylab = "funtzioaren baloreak")

#h
plot(r)
hist(r)

#5.ariketa

bakoitiak <- seq(1,2*100,2)
sort(bakoitiak, decreasing = TRUE)

#6.ariketa
bikoitiak <- seq(100,199,2)
y<-log(bikoitiak)
plot(bikoitiak,y)
z<-cos(bikoitiak)
plot(bikoitiak,z)

#7.ariketa
batezbestekoa<-function(x)sum(x)/length(x)
a<-c(1,2,5,10)
batezbestekoa(a)

#8.ariketa
f <- function(x)sin(x^2+x^3)
puntuak <- c(-3*pi,-2*pi,-pi,0,pi,2*pi,3*pi)
f(puntuak)
plot(f,-pi,pi)

#9.ariketa
rm(x)#x aldagaiaren balioak garbitzeko eta ezabatzeko
x<-seq(2,40,2)
length(x)
xkarratura<-x^2
xkubora<-x^3
datuak<-data.frame(x,xkarratura,xkubora)
write.table(datuak,"ariketa9.txt")
#10.ariketa
library()
library(datasets)
