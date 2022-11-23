[#items as osoba]
    <tr>
        <td>${osoba.jmeno}</td>
        <td>${osoba.prijmeni}</td>
        <td>${osoba.datumNarozeni?date}</td>
        <td>${osoba.adresa}</td>
        <td class="d-flex justify-content-end"><a href="/${osoba.id}" class="btn btn-primary">Detail</a></td>
    </tr>
[/#items]


[#ftl]
[@c.page]
    <div class="seznam">
        <a href="/detail">
            [#items as vizitka]
            <div class="vizitka">
                <div class="jmeno">${vizitka.celejmeno}</div>
                <div class="firma">${vizitka.firma}</div>
                <div class="udaje">
                    <div class="adresa">
                        <div>${vizitka.ulice}</div>
                        <div><span>${vizitka.psc}</span> <span>${vizitka.obec}</span></div>
                    </div>
                    <div class="kontakty">
                        <div><i class="las la-at"></i> <span>${vizitka.email}</span></div>
                        <div><i class="las la-phone-alt"></i> <span>${vizitka.telefon}</span></div>
                        <div><i class="las la-globe"></i> <span>${vizitka.web}</span></div>
                    </div>
                </div>
            </div>
            [/#items]
        </a>

        <a href="/nova">
            <div class="vizitka vizitka--nova">
                <svg width="100" height="100">
                    <rect width="20" height="100" x="40" y="0" fill="white"/>
                    <rect width="100" height="20" x="0" y="40" fill="white"/>
                </svg>
            </div>
        </a>
    </div>
[/@c.page]
