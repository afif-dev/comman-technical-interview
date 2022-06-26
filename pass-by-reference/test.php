<?php
// Run code with PHP
// php -S localhost:8080 -t ../pass-by-reference

function swapNums(&$firstNum, &$secondNum) {
    $tmp = $firstNum;
    $firstNum = $secondNum;
    $secondNum = $tmp;
}

$firstNum = 25;
$secondNum = 20;

echo "Before swap: <br/>";
echo $firstNum." - ".$secondNum."<br/>";

swapNums($firstNum, $secondNum);

echo "After swap: <br/>";
echo $firstNum." - ".$secondNum."<br/>";

?>