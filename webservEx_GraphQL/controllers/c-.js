const { GENRES, TRACKS } = require("../models/m-spotifEx")


class get_SpotifEx {

    async tracks() {
        return await TRACKS.find().populate("genres").exec()
    }
}

const c_mongodb = new get_SpotifEx()

module.exports = { c_mongodb }