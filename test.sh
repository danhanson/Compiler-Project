#! /bin/bash
testDir='./test-data/FullTests'
expectedDir='./test-data/ExpectedOutput'
jar='./bin/typeChecker.jar'
tests=$testDir/*.java
for input in $tests
do
	echo "running test $input"
	file=$(basename $input)
	expected=$(cat $expectedDir/${file%.*}.out)
	echo "expecting:"
	echo $expected
	output=$(java -jar $jar $input)
	if [ $? -ne 0 ]
	then
		echo $output
		echo "nonzero exit code detected"
		exit 0
	fi
	if [ "$output == $expected" ]
	then
		echo "\n"
	else
		echo "Failed, Got:"
		echo $output
		exit 0
	fi
done
