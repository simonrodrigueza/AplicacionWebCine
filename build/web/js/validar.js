/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function validarAforoNegativo() {
    var aforo;
    aforo = document.getElementById("aforo").value;
    if (aforo < 0)
    {
        alert("El aforo no puede ser negativo");
        return false;
    }
}
function mensajeReservar(aforo)
{
        if(aforo===0)
        {
            alert("Ya no quedan asientos disponibles.");
            return false;
        }
        alert("Asiento reservado con éxito.");
}



