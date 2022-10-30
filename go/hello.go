package main

import "time"

func main() {
	c := make(chan int)
	go func() {
		print("Hello")
		c <- 0
	}()

	go func() {
		<-c
		print(" World")
	}()

	time.Sleep(1000)
}
