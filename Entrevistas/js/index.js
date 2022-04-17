const express = require('express')
const app = express()
const path = require('path')
const port = 3000

app.get('/hello', function (req, res) {
    res.send('Hello World')
})

app.listen(port, () => console.log(`App listening on port ${port}!`))
