const { mongoose } = require(process.env.MONGOOSE)

const mongooseConnect = mongoose.createConnection(
    process.env.ENGINE_MONGODB,
    {
        //useNewUrlParser: true,
        //useUnifiedTopology: true
    }
)

module.exports = { mongoose, mongooseConnect }