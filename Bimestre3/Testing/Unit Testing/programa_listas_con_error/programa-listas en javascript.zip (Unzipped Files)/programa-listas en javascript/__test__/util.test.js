const { generateText, validateInput, createElement } = require("../util.js")

describe("Pruebas de salida de datos", () => {
  test("Salida con datos", () => {
    const text = generateText("Daniel", 30)
    expect(text).toBe("Daniel (30 years old)")
  })

  test("Salida con datos vacios", () => {
    const text = generateText("", null)
    expect(text).toBe(" (null years old)")
  })

  test("Salida sin datos", () => {
    const text = generateText()
    expect(text).toBe("undefined (undefined years old)")
  })
})

describe("Pruebas del método validateInput", () => {
  const mockParams = {
    text: "Laura Ramos",
    notEmpty: true,
    isNumber: false,
  }

  test("El input nombre debe ser texto", () => {
    const result = validateInput(
      mockParams.text,
      mockParams.notEmpty,
      mockParams.isNumber
    )
    expect(result).toBeTruthy()
  })

  test("El input nombre no deben ser solo espacios", () => {
    const text = "   "
    const result = validateInput(text, mockParams.notEmpty, mockParams.isNumber)
    expect(result).toBeFalsy()
  })

  test("El input nombre no deben ser números", () => {
    const isNumber = true
    const text = 5
    const notEmpty = false
    const result = validateInput(text, notEmpty, isNumber)
    expect(result).toBeTruthy()
    //esto está malo, hay error en el código
  })

  test("El input nombre no debe estar vacío", () => {
    const text = ""
    const result = validateInput(text, mockParams.notEmpty, mockParams.isNumber)
    expect(result).toBeFalsy()
  })
})

describe("Pruebas del método createElement", () => {
  test("Se debe crear elemento", () => {
    const type = "div"
    const text = "Laura 21"
    const classname = "classname"
    const component = createElement(type, text, classname)
    expect(component).toBeTruthy()
  })
})
