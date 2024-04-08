<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Project/PHP/PHPProject.php to edit this template
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
<?php

function bubbleSort(&$array) {
    $n = count($array);
    for ($i = 0; $i < $n-1; $i++) {
        for ($j = 0; $j < $n-$i-1; $j++) {
            if ($array[$j] > $array[$j+1]) {
                $temp = $array[$j];
                $array[$j] = $array[$j+1];
                $array[$j+1] = $temp;
            }
        }
    }
}

function mergeSort(&$array) {
    $n = count($array);
    if ($n < 2) {
        return;
    }
    $middle = (int)($n / 2);
    $leftArray = array_slice($array, 0, $middle);
    $rightArray = array_slice($array, $middle);
    
    mergeSort($leftArray);
    mergeSort($rightArray);
    merge($array, $leftArray, $rightArray);
}

function merge(&$array, $leftArray, $rightArray) {
    $n1 = count($leftArray);
    $n2 = count($rightArray);
    $i = $j = $k = 0;

    while ($i < $n1 && $j < $n2) {
        if ($leftArray[$i] <= $rightArray[$j]) {
            $array[$k] = $leftArray[$i];
            $i++;
        } else {
            $array[$k] = $rightArray[$j];
            $j++;
        }
        $k++;
    }

    while ($i < $n1) {
        $array[$k] = $leftArray[$i];
        $i++;
        $k++;
    }

    while ($j < $n2) {
        $array[$k] = $rightArray[$j];
        $j++;
        $k++;
    }
}

function cocktailSort(&$array) {
    $n = count($array);
    $swapped = true;
    $start = 0;
    $end = $n - 1;
    
    while ($swapped) {
        $swapped = false;
        
        // Move the largest element to end
        for ($i = $start; $i < $end; ++$i) {
            if ($array[$i] > $array[$i + 1]) {
                $temp = $array[$i];
                $array[$i] = $array[$i + 1];
                $array[$i + 1] = $temp;
                $swapped = true;
            }
        }
        
        // If nothing moved, array is sorted
        if (!$swapped)
            break;
        
        $swapped = false;
        $end--;
        
        // Move the smallest element to beginning
        for ($i = $end - 1; $i >= $start; --$i) {
            if ($array[$i] > $array[$i + 1]) {
                $temp = $array[$i];
                $array[$i] = $array[$i + 1];
                $array[$i + 1] = $temp;
                $swapped = true;
            }
        }
        
        $start++;
    }
}

function insertionSort(&$array) {
    $n = count($array);
    for ($i = 1; $i < $n; ++$i) {
        $key = $array[$i];
        $j = $i - 1;
        while ($j >= 0 && $array[$j] > $key) {
            $array[$j + 1] = $array[$j];
            $j = $j - 1;
        }
        $array[$j + 1] = $key;
    }
}

function selectionSort(&$array) {
    $n = count($array);
    for ($i = 0; $i < $n-1; $i++) {
        $minIndex = $i;
        for ($j = $i+1; $j < $n; $j++) {
            if ($array[$j] < $array[$minIndex]) {
                $minIndex = $j;
            }
        }
        $temp = $array[$minIndex];
        $array[$minIndex] = $array[$i];
        $array[$i] = $temp;
    }
}

$array = array(64, 25, 12, 22, 11);
bubbleSort($array);
echo "Bubble Sort: " . implode(", ", $array) . "<br>";

$array = array(64, 25, 12, 22, 11);
mergeSort($array);
echo "Merge Sort: " . implode(", ", $array) . "<br>";

$array = array(64, 25, 12, 22, 11);
cocktailSort($array);
echo "Cocktail Sort: " . implode(", ", $array) . "<br>";

$array = array(64, 25, 12, 22, 11);
insertionSort($array);
echo "Insertion Sort: " . implode(", ", $array) . "<br>";

$array = array(64, 25, 12, 22, 11);
selectionSort($array);
echo "Selection Sort: " . implode(", ", $array) . "<br>";

?>
    </body>
</html>
