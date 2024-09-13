require('dotenv').config()
const Express = require("express")
const cors = require("cors")


const Server = Express()

Server.use(cors())

Server.get("/", (req, res) => {
    res.status(200).json({message: "WooooHooooo!"})
})

Server.listen(process.env.SERVER_PORT)