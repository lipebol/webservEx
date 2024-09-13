require('dotenv').config()
const Express = require("express")


const Server = Express()


Server.get("/", (req, res) => {
    res.status(200).json({message: "WooooHooooo!"})
})

Server.listen(process.env.SERVER_PORT)