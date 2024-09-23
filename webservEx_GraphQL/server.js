require('dotenv').config()
const cors = require(process.env.CORS)
const Express = require(process.env.SERVER)
const helmet = require(process.env.HELMET)
const graphql = require(process.env.GRAPHQL_MAIN)

const Server = Express()

Server.use(cors())
Server.use(
    helmet(
        {
            contentSecurityPolicy: (
                process.env.NODE_ENV === process.env.MODE
            ) ? undefined : false
        }
    )
)


Server.use(process.env.ROUTE_GRAPHQL, graphql)

Server.use(
    (req, res) => {
        return res.status(404).json({ error: process.env.NOT_FOUND })
    }
)

Server.listen(process.env.SERVER_PORT)