const Header = () => {
    const elements = ['Home', 'About', 'Career', 'Education']
    const elementsJsx = elements.map((item, index) => (<a className='item' href='#' key={index}>{item}</a>))
    return <section className='header'>{elementsJsx}</section>
}

const Avatar = () => {
    return <img className='avatar' src='assets/avatar.jpeg'></img>
}

const PersonalInformation = ({ name, lastname, age, nationality, movies, education, bio }) => {
    return (
        <div className='personal-information'>
            <h1>Personal Information:</h1>
            <p>Name: <span>{name}</span></p>
            <p>Last Name: <span>{lastname}</span></p>
            <p>Age: <span>{age}</span></p>
            <p>Nationality: <span>{nationality}</span></p>

            <section>
                <h1>Experience in movies:</h1>
                <ul>{movies.map((movie, index) => <li key={index}>{movie}</li>)}</ul>
            </section>

            <section>
                <h1>Education:</h1>
                <ul>{education.map((ed, index) => <li key={index}>{ed}</li>)}</ul>
            </section>

            <section>
                <h1>Bio:</h1>
                <p>{bio}</p>
            </section>
        </div>
    )
}

const AboutSection = () => {
    const movies = ['Pirates of the Caribbean', 'Johnny scissors hand.', 'Trascendent']
    const education = ['University of Arts', 'University of UCLA']
    const bio = "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?"
    return (
        <section className='about-section'>
            <Avatar />
            <PersonalInformation
                name='Johnny'
                lastname='Depp'
                age='59'
                nationality='USA' 
                movies={movies} 
                education={education}
                bio={bio}
            />
        </section>
    )
}

ReactDOM.render(
    <React.Fragment>
        <Header />
        <AboutSection />
    </React.Fragment>,
    document.getElementById("root")
)