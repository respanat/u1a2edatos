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
class ListaPersonalizada {
    private $lista;
    private $elementosAgregados;
    private $elementosEliminados;

    public function __construct() {
        $this->lista = array();
        $this->elementosAgregados = array();
        $this->elementosEliminados = array();
    }

    public function agregarElemento($elemento) {
        array_push($this->lista, $elemento);
        array_push($this->elementosAgregados, $elemento);
        echo "Agregado: " . $elemento . "\n";
    }

    public function eliminarElemento($elemento) {
        $index = array_search($elemento, $this->lista);
        if ($index !== false) {
            unset($this->lista[$index]);
            array_push($this->elementosEliminados, $elemento);
            echo "Eliminado: " . $elemento . "\n";
        } else {
            echo "El elemento no existe en la lista.\n";
        }
    }

    public function longitud() {
        return count($this->lista);
    }

    public function imprimirElementosAgregados() {
        echo "Elementos agregados: " . implode(", ", $this->elementosAgregados) . "\n";
    }

    public function imprimirElementosEliminados() {
        echo "Elementos eliminados: " . implode(", ", $this->elementosEliminados) . "\n";
    }
}


$listaPersonalizada = new ListaPersonalizada();
$listaPersonalizada->agregarElemento(5);
$listaPersonalizada->agregarElemento(10);
$listaPersonalizada->eliminarElemento(5);
echo "Longitud de la lista: " . $listaPersonalizada->longitud() . "\n";
$listaPersonalizada->imprimirElementosAgregados();
$listaPersonalizada->imprimirElementosEliminados();
?>

    </body>
</html>
