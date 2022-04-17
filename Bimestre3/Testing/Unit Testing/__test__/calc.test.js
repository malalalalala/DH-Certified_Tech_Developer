const { suma, resta, multiplicacion, division } = require("../calc")

describe("prueba de sumas", () => {
  test("Suma de dos números", () => {
    expect(suma(1, 2)).toBe(3)
  })

  test("Suma de 0", () => {
    expect(suma(0, 0)).toBe(0)
  })

  test("Suma de null", () => {
    expect(suma(null, null)).toBe(0)
  })

  test("Suma de texto", () => {
    expect(suma("a", "b")).toBe(0)
  })
})

describe("prueba de restas", () => {
  test("Resta de dos números", () => {
    expect(resta(2, 1)).toBe(1)
  })

  test("Resta de 0", () => {
    expect(resta(0, 0)).toBe(0)
  })

  test("Resta de null", () => {
    expect(resta(null, null)).toBe(0)
  })

  test("Resta de texto", () => {
    expect(resta("a", "b")).toBe(0)
  })

  test("Resta de texto", () => {
    expect(resta("1", "2")).toBe(-1)
  })
})

describe("prueba de multiplicacion", () => {
  test("Multiplicacion de dos números", () => {
    expect(multiplicacion(2, 1)).toBe(2)
  })

  test("Multiplicacion de 0", () => {
    expect(multiplicacion(0, 0)).toBe(0)
  })

  test("Multiplicacion de null", () => {
    expect(multiplicacion(null, null)).toBe(0)
  })

  test("Multiplicacion de texto", () => {
    expect(multiplicacion("a", "b")).toBe(0)
  })

  test("Multiplicacion de dos números diferentes de 1", () => {
    expect(multiplicacion("2", "2")).toBe(4)
  })
})

describe("prueba de división", () => {
  test("Division de dos números", () => {
    expect(division(2, 1)).toBe(2)
  })

  test("Division de 0", () => {
    expect(() => {
      division(0, 0)
    }).toThrow("Invalid dividend 0")
  })

  test("Division de null", () => {
    expect(() => {
      division(null, null)
    }).toThrow("Invalid dividend null")
  })

  test("Division de texto", () => {
    expect(division("a", "b")).toBe(0)
  })

  test("Division de dos números condivisor diferente a 1", () => {
    expect(division("2", "2")).toBe(1)
  })
})
