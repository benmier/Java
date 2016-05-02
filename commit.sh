#!/bin/bash
for i in {1..144}
do
	git add .
	git commit -m 'Java demo'
	git push
	sleep 300
done
