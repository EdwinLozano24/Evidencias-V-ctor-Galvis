<?php
$arreglo = [
    "Nombre" => "Pedro",
    "Apellido" => "Perez",
];
echo "Buenos días" . $arreglo["Nombre"] . " " .
    $arreglo["Apellido"];
?>

<?php
//Para colocar una constante sin variable
$arreglo = ["Jacinto", "Jose", "Pepita", "Mendieta"];
echo "Buenos días" . $arreglo[0] . " " . $arreglo[1] . " " .
    $arreglo[2] . " " . $arreglo[3] . "\n";
var_dump($arreglo);
?>