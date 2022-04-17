const PI = Math.PI

exports.area = function (radio) {
  return PI * radio * radio
}

function aux(radio) {
  PI * radio
}

exports.circunferencia = function (radio) {
  return 2 * aux(radio)
}
