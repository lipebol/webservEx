const { mongoose, mongooseConnect } = require("../instances/mongodb")


const GENRES = mongooseConnect.model(
    "GENRES", new mongoose.Schema(
        {
            name: { type: String, required: true },
            url: { type: String, required: true }
        }
    ),
    "genres"
)


const TRACKS = mongooseConnect.model(
    "TRACKS", new mongoose.Schema(
        {
            trackid: { type: String, required: true },
            length: { type: String, required: true },
            artUrl: { type: String, required: true },
            album: { type: String, required: true },
            artist: { type: String, required: true },
            autoRating: { type: String, required: true },
            discNumber: { type: String, required: true },
            title: { type: String, required: true },
            trackNumber: { type: String, required: true },
            url: { type: String, required: true },
            genres: [{
                type: mongoose.ObjectId,
                ref: "GENRES"
            }]
        }
    ),
    "tracks"
)

module.exports = { GENRES, TRACKS }