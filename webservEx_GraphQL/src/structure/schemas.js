const { buildSchema } = require(process.env.GRAPHQL)

const schemas = buildSchema(`
    scalar Date

    type Query {
        playlist: [TRACKS]
    }
    
    type TRACKS {
        _id: ID
        trackid: String
        length: String
        artUrl: String
        album: String
        artist: String
        autoRating: String
        discNumber: String
        title: String
        trackNumber: String
        url: String
        genres: [GENRES]
    }

    type GENRES {
        _id: ID
        name: String
        url: String
    }
`)

module.exports = { schemas }