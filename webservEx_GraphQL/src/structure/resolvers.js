const { c_mongodb } = require("../../controllers/c-")


const resolvers = {
    async playlist(args) {
        return await c_mongodb.tracks()
    }
}




module.exports = { resolvers }