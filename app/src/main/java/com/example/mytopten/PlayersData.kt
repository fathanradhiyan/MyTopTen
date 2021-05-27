package com.example.mytopten

object PlayersData {
    private val playerNames = arrayOf(
        "Kobe Bryant",
        "Michael Jordan",
        "LeBron James",
        "Stephen Curry",
        "Shaquille O'Neal",
        "Magic Johnson",
        "Giannis Antetokounmpo",
        "Kyrie Irving",
        "Kevin Durant",
        "Kareem Abdul-Jabbar"
    )

    private val playerTeams = arrayOf(
        "LA Lakers",
        "Chicago Bulls",
        "LA Lakers",
        "Golden State Warrior",
        "Miami Heat",
        "LA Lakers",
        "Milwaukee Bucks",
        "Brooklyn Nets",
        "Brooklyn Nets",
        "LA Lakers"
    )

    private val isActivePlayer = arrayOf(
        false, false, true, true, false, false, true, true, true, false
    )

    private val playerDetails = arrayOf(
        "Kobe Bean Bryant was an American professional basketball player. A shooting guard, he spent his entire 20-year career with the Los Angeles Lakers in the National Basketball Association (NBA). Regarded as one of the greatest players of all time, Bryant won five NBA championships, was an 18-time All-Star, a 15-time member of the All-NBA Team, a 12-time member of the All-Defensive Team, the 2008 NBA Most Valuable Player (MVP), and a two-time NBA Finals MVP. Bryant also led the NBA in scoring twice, and ranks fourth in league all-time regular season and postseason scoring. He was posthumously voted into the Naismith Memorial Basketball Hall of Fame in 2020.",
        "Michael Jeffrey Jordan, also known by his initials MJ, is an American businessman and former professional basketball player. He is the principal owner and chairman of the Charlotte Hornets of the National Basketball Association (NBA) and of 23XI Racing in the NASCAR Cup Series. He played 15 seasons in the NBA, winning six championships with the Chicago Bulls. His biography on the official NBA website states: \"By acclamation, Michael Jordan is the greatest basketball player of all time.\" He was integral in helping to popularize the NBA around the world in the 1980s and 1990s, becoming a global cultural icon in the process.",
        "LeBron Raymone James Sr. is an American professional basketball player for the Los Angeles Lakers of the National Basketball Association (NBA). Widely considered one of the greatest NBA players in history, James is frequently compared to Michael Jordan in debates over the greatest basketball player of all time. Playing for the Cleveland Cavaliers, Miami Heat, and Los Angeles Lakers, James is the only player in NBA history to have won NBA championships with three franchises as Finals MVP. He has competed in ten NBA Finals, including eight consecutive with the Heat and Cavaliers from 2011 through 2018. His accomplishments include four NBA championships, four NBA Most Valuable Player (MVP) Awards, four Finals MVP Awards, and two Olympic gold medals. During his 17-year career, James holds the record for all-time playoffs points, is third in all-time points, and eighth in career assists. James has been selected to the All-NBA First Team a record 13 times, made the All-Defensive First Team five times, and has been named an All-Star 17 times, including three All-Star MVP selections.",
        "Wardell Stephen \"Steph\" Curry II is an American professional basketball player for the Golden State Warriors of the National Basketball Association (NBA). He plays the point guard position. Many analysts and players have called him the greatest shooter in NBA history. He is credited with revolutionizing the game of basketball by inspiring teams to regularly utilize the three-point shot. A seven-time NBA All-Star, Curry has been named the NBA Most Valuable Player (MVP) twice and has won three NBA championships with the Warriors.",
        "Shaquille Rashaun O'Neal is an American former professional basketball player who is a sports analyst on the television program Inside the NBA. O’Neal was a 7-foot-1-inch (2.16 m) and 325-pound (147 kg) center who played for six teams over his 19-year career in the National Basketball Association (NBA) and is a four-time NBA champion. O'Neal is regarded as one of the greatest basketball players and centers of all time.",
        "Earvin \"Magic\" Johnson Jr. is an American former professional basketball player and former president of basketball operations of the Los Angeles Lakers of the National Basketball Association (NBA). Often regarded as the best point guard of all time, Johnson played 13 seasons for the Lakers and was honored as one of the 50 Greatest Players in NBA History in 1996. After winning championships in high school and college, Johnson was selected first overall in the 1979 NBA draft by the Lakers. He won a championship and an NBA Finals Most Valuable Player Award in his rookie season, and won four more championships with the Lakers during the 1980s. Johnson retired abruptly in 1991 after announcing that he had contracted HIV, but returned to play in the 1992 All-Star Game, winning the All-Star MVP Award. After protests from his fellow players, he retired again for four years, but returned in 1996, at age 36, to play 32 games for the Lakers before retiring for the third and final time.",
        "Giannis Sina Ugo Antetokounmpo is a Greek professional basketball player for the Milwaukee Bucks of the National Basketball Association (NBA). Born in Greece to Nigerian parents, Antetokounmpo began playing basketball for the youth teams of Filathlitikos in Athens. In 2011, he began playing for the club's senior team before entering the 2013 NBA draft, where he was selected 15th overall by the Bucks. Antetokounmpo's nationality, in addition to his combination of size, speed and ball-handling skills earned him the nickname \"Greek Freak\".",
        "Kyrie Andrew Irving is an American professional basketball player for the Brooklyn Nets of the National Basketball Association (NBA). He was named the Rookie of the Year after being selected by the Cleveland Cavaliers with the first overall pick in the 2011 NBA draft. A seven-time All-Star and two-time member of the All-NBA Team, he won an NBA championship with the Cavaliers in 2016.",
        "Kevin Wayne Durant, also known simply by his initials KD, is an American professional basketball player for the Brooklyn Nets of the National Basketball Association (NBA). He played one season of college basketball for the University of Texas, and was selected as the second overall pick by the Seattle SuperSonics in the 2007 NBA draft. He played nine seasons with the franchise, which became the Oklahoma City Thunder in 2008, before signing with the Golden State Warriors in 2016, winning back-to-back championships in 2017 and 2018.",
        "Kareem Abdul-Jabbar is an American former professional basketball player who played 20 seasons in the National Basketball Association (NBA) for the Milwaukee Bucks and the Los Angeles Lakers. During his career as a center, Abdul-Jabbar was a record six-time NBA Most Valuable Player (MVP), a record 19-time NBA All-Star, a 15-time All-NBA selection, and an 11-time NBA All-Defensive Team member. A member of six NBA championship teams as a player and two more as an assistant coach, Abdul-Jabbar twice was voted NBA Finals MVP. In 1996, he was honored as one of the 50 Greatest Players in NBA History. NBA coach Pat Riley and players Isiah Thomas and Julius Erving have called him the greatest basketball player of all time."
    )

    private val playerPhotos = intArrayOf(
        R.drawable.kobe,
        R.drawable.jordan,
        R.drawable.lebron,
        R.drawable.curry,
        R.drawable.shaq,
        R.drawable.magic,
        R.drawable.giannis,
        R.drawable.kyrie,
        R.drawable.kd,
        R.drawable.kareem
    )

    val listData: ArrayList<Player>
        get() {
            val list = arrayListOf<Player>()
            for (position in playerNames.indices) {
                val players = Player()
                players.name = playerNames[position]
                players.team = playerTeams[position]
                players.isActive = isActivePlayer[position]
                players.detail = playerDetails[position]
                players.photo = playerPhotos[position]
                list.add(players)
            }
            return list
        }
}